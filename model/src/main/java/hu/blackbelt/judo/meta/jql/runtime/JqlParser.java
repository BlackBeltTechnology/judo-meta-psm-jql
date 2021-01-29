package hu.blackbelt.judo.meta.jql.runtime;

import com.google.inject.Injector;
import hu.blackbelt.judo.meta.jql.JqlDslStandaloneSetupGenerated;
import hu.blackbelt.judo.meta.jql.jqldsl.JqlExpression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class JqlParser {

    private static final Logger log = LoggerFactory.getLogger(JqlParser.class);

    public static final String JQLSCRIPT_CONTENT_TYPE = "jql";
    private static Injector injectorInstance;

    private static Injector injector() {
        if (injectorInstance == null) {
            final long startTs = System.currentTimeMillis();
            injectorInstance = new JqlDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
            Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put(JQLSCRIPT_CONTENT_TYPE,
                    injectorInstance.getInstance(IResourceFactory.class));
            log.trace("Initialized XText for JQL in {} ms", (System.currentTimeMillis() - startTs));
        }
        return injectorInstance;
    }

    public XtextResource loadJqlFromFile(final File jqlFile) {
        final long startTs = System.currentTimeMillis();
        try {
            final XtextResource jqlResource = (XtextResource) injector().getInstance(XtextResourceSet.class)
                    .createResource(URI.createFileURI(jqlFile.getAbsolutePath()), JQLSCRIPT_CONTENT_TYPE);
            jqlResource.load(new FileInputStream(jqlFile),
                    injector().getInstance(XtextResourceSet.class).getLoadOptions());

            return jqlResource;
        } catch (IOException ex) {
            throw new IllegalStateException("Unable to parse JqlExpression", ex);
        } finally {
            log.trace("Loaded JQL from file in {} ms", (System.currentTimeMillis() - startTs));
        }
    }

    public XtextResource loadJqlFromStream(final InputStream stream, final URI resourceUri) {
        final long startTs = System.currentTimeMillis();
        try {
            final XtextResource jqlResource = (XtextResource) injector().getInstance(XtextResourceSet.class)
                    .createResource(resourceUri, JQLSCRIPT_CONTENT_TYPE);
            jqlResource.load(stream, injector().getInstance(XtextResourceSet.class).getLoadOptions());

            return jqlResource;
        } catch (IOException ex) {
            throw new IllegalStateException("Unable to parse JqlExpression", ex);
        } finally {
            log.trace("Loaded JQL stream in {} ms", (System.currentTimeMillis() - startTs));
        }
    }

    public XtextResource loadJqlFromString(final String jqlExpression, final URI resourceUri) {
        final long startTs = System.currentTimeMillis();
        if (jqlExpression == null) {
            return null;
        }

        if (log.isDebugEnabled()) {
            log.trace("Parsing JqlExpression: {}", jqlExpression);
        }

        try {
            final XtextResource jqlResource = (XtextResource) injector().getInstance(XtextResourceSet.class)
                    .createResource(resourceUri, JQLSCRIPT_CONTENT_TYPE);
            final InputStream in = new ByteArrayInputStream(jqlExpression.getBytes("UTF-8"));
            Map<Object, Object> defaultLoadOptions = injector().getInstance(XtextResourceSet.class).getLoadOptions();
            HashMap<Object, Object> loadOptions = new HashMap<>(defaultLoadOptions);
            loadOptions.put(XtextResource.OPTION_ENCODING,  "UTF-8");
            jqlResource.load(in, loadOptions);

            return jqlResource;
        } catch (IOException ex) {
            throw new IllegalStateException("Unable to parse JqlExpression", ex);
        } finally {
            log.trace("Loaded JQL string in {} ms", (System.currentTimeMillis() - startTs));
        }
    }

    public JqlExpression parseFile(final File jqlFile) {
        // get first entry of jqlResource (root JqlExpression)
        final Iterator<EObject> iterator = loadJqlFromFile(jqlFile).getContents().iterator();
        if (iterator.hasNext()) {
            return (JqlExpression) EcoreUtil.copy(iterator.next());
        } else {
            return null;
        }
    }

    public JqlExpression parseStream(final InputStream stream) {
        return parseStream(stream, URI.createURI("urn:" + UUID.randomUUID()));
    }

    public JqlExpression parseStream(final InputStream stream, final URI resourceUri) {
        // get first entry of jqlResource (root JqlExpression)
        final Iterator<EObject> iterator = loadJqlFromStream(stream, resourceUri).getContents().iterator();
        if (iterator.hasNext()) {
            return (JqlExpression) EcoreUtil.copy(iterator.next());
        } else {
            return null;
        }
    }

    public JqlExpression parseString(final String jqlExpression) {
        return parseString(jqlExpression, URI.createURI("urn:" + UUID.randomUUID()));
    }

    public JqlExpression parseString(final String jqlExpression, final URI resourceUri) {
        XtextResource resource = loadJqlFromString(jqlExpression, resourceUri);
        EList<Diagnostic> errors = resource.getErrors();
        if (!errors.isEmpty()) {
            throw new JqlParseException(jqlExpression, errors);
        }
        Iterator<EObject> iterator = resource.getContents().iterator();
        if (iterator.hasNext()) {
            return (JqlExpression) EcoreUtil.copy(iterator.next());
        } else {
            return null;
        }
    }
}

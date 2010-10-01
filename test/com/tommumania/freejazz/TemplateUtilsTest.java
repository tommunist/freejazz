package com.tommumania.freejazz;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TemplateUtilsTest {
    private TemplateUtils templateUtils;

    @Before
    public void setUp() throws Exception {
        templateUtils = new TemplateUtils();
    }

    @Test
    public void shouldProcessTemplateIntoString() throws IOException, TemplateException {
        Map modelmap = mock(Map.class);
        Template template = mock(Template.class);

        templateUtils.processTemplateIntoString(template, modelmap);

        verify(template).process(eq(modelmap), any(StringWriter.class));
    }
}

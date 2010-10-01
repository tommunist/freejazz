package com.tommumania.freejazz;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DomGeneratorTest {

    private DomGenerator domGenerator;
    @Mock
    private TemplateFactory templateFactory;
    @Mock
    private TemplateUtils templateUtils;

    @Before
    public void setUp() {
        domGenerator = new DomGenerator(templateFactory, templateUtils);
    }

    @Test
    public void shouldProcessFreemarkerTemplate() throws IOException, TemplateException {
        Template template = mock(Template.class);
        Map modelMap = mock(Map.class);

        when(templateFactory.getTemplate("test.ftl")).thenReturn(template);
        when(templateUtils.processTemplateIntoString(template, modelMap)).thenReturn("some processed content");

        String domContent = domGenerator.process("test.ftl", modelMap);

        assertThat(domContent, is("some processed content"));

    }
}

package com.tommumania.freejazz;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DomGeneratorIntegrationTest {

    private DomGenerator domGenerator;

    @Before
    public void setUp() {
        domGenerator = new DomGenerator(new TemplateFactory(), new TemplateUtils());
    }

    @Test
    public void shouldProcessFreemarkerTemplate() throws IOException, TemplateException {
        Map modelMap = new HashMap<String, Object>();

        modelMap.put("test", "Some Test String");

        String domContent = domGenerator.process("hello_world.ftl", modelMap);

        assertThat(domContent, is("some processed content with Some Test String"));
    }
}
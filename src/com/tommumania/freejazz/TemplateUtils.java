package com.tommumania.freejazz;

import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

public class TemplateUtils {
    public String processTemplateIntoString(Template template, Map modelMap) throws IOException, TemplateException {
        Writer writer = new StringWriter();
        template.process(modelMap, writer);
        return writer.toString();
    }
}

package com.tommumania.freejazz;

import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

public class DomGenerator {
    private TemplateFactory templateFactory;
    private TemplateUtils templateUtils;

    public DomGenerator(TemplateFactory templateFactory, TemplateUtils templateUtils) {
        this.templateFactory = templateFactory;
        this.templateUtils = templateUtils;
    }

    public String process(String templateFilename, Map modelMap) throws IOException, TemplateException {
        Template template = templateFactory.getTemplate(templateFilename);
        return templateUtils.processTemplateIntoString(template, modelMap);
    }
}

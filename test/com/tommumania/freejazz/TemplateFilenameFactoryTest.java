package com.tommumania.freejazz;

import com.tommumania.freejazz.TemplateFilenameFactory;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TemplateFilenameFactoryTest {

    @Test
    public void shouldMapHelloWorldTypeToCorrectFilename() {
        assertThat(new TemplateFilenameFactory().getFilename(), is("hello_world-plain.ftl"));
    }

}

package com.arangodb.intellij.aql.ui;

import com.arangodb.intellij.aql.util.JSON;
import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestHelpFiles {

    private static final Logger log = LoggerFactory.getLogger(TestHelpFiles.class);
    @Test
    public void testFiles() {
        try (final InputStream stream = getClass().getResourceAsStream("/testData/functions.json")) {


            final String string = CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
            final FunObject funObject = JSON.fromJson(string, FunObject.class);
            final FunObject[] functions = funObject.functions;
            for (FunObject function : functions) {
                final String name = "/docs/"  + function.name + ".html";
                try (final InputStream docStream = getClass().getResourceAsStream(name)) {
                    if (docStream == null) {
                        log.warn("Missing documentation for function: {}", name);
                    }
                }

            }
        } catch (IOException e) {
            log.error("", e);
        }

    }


    private static class FunObject {
        public FunObject() {
        }

        public String name;

        public FunObject[] functions;

        public FunObject(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public FunObject[] getFunctions() {
            return functions;
        }

        public void setFunctions(final FunObject[] functions) {
            this.functions = functions;
        }

        @Override
        public String toString() {
            return "FunObject{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

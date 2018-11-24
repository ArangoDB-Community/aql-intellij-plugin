package com.machak.aql;

import com.machak.aql.util.AqlConst;

import java.io.File;
import java.net.URL;

public final class TestHelper {


    public static final String EXTENSION = '.' + AqlConst.AQL_FILE_EXTENSION;

    private TestHelper() {
    }

    public static String getTestResourcePath(final String path) {
        final ClassLoader classLoader = TestHelper.class.getClassLoader();
        final URL resource = classLoader.getResource("test.txt");
        final File file = new File(resource.getFile());
        return file.getParentFile().getAbsolutePath() + path;
    }
}

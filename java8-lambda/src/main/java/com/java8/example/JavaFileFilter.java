package com.java8.example;

import java.io.File;

/**
 * @author vkumar1 created on 5/8/21
 */
public class JavaFileFilter implements java.io.FileFilter {

    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".java");
    }
}

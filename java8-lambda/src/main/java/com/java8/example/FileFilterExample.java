package com.java8.example;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * @author vkumar1 created on 5/8/21
 */
public class FileFilterExample {

    public static void main(String[] args) {
        FileFilter fileFilter = new JavaFileFilter();
        File dir = new File("/tmp");
        File[] javaFile = dir.listFiles(fileFilter);
        System.out.println(Arrays.toString(javaFile));
    }

}

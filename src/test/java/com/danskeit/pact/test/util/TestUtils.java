package com.danskeit.pact.test.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;

public class TestUtils {
 
    public static String getResposeFromFile(final String fileName) {
        File responseMessage;
        try {
            responseMessage = new ClassPathResource(fileName).getFile();
            return FileUtils.readFileToString(responseMessage, "utf-8");

        } catch (IOException e) {
           e.printStackTrace();
        }
        return null;
    }
}

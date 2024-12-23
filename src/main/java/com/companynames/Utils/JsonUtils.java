package com.companynames.Utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class JsonUtils {

    public static String readJsonFile(String fileName) throws IOException, URISyntaxException {

        URI uriPath= Objects.requireNonNull(JsonUtils.class
                        .getClassLoader()
                        .getResource(fileName))
                .toURI();

        //convert jason to String
        System.out.println("file path"+uriPath);



        String filePath= Objects.requireNonNull(JsonUtils.class
                        .getClassLoader()
                        .getResource(filePath))
                .getPath();



        return  new String(Files.readAllBytes(Paths.get(uriPath)));

        //convert jason to String
//        System.out.println("file path"+uriPath);
//        return  new String(Files.readAllBytes(Paths.get(uriPath)));

    }





}

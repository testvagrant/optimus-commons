package com.testvagrant.commons.parser;

import com.testvagrant.commons.entities.RunConfiguration;

import java.io.File;
import java.io.IOException;

import static com.testvagrant.commons.utils.OptimusConfigMapper.mapper;

public class RunConfigParser {

    private static String runConfigName;
    private static final String runConfigLocation = System.getProperty("user.dir")+"/src/test/resources/META-INF/runconfigs/";
    private static final String runConfigExtension = ".yaml";

    public static RunConfiguration getRunConfiguration(String runConfigName) {
        RunConfiguration runConfiguration = new RunConfiguration();
        if(runConfigName.equalsIgnoreCase("default"))
            return runConfiguration;
        File configFile = new File(String.format("%s%s%s",runConfigLocation,runConfigName,runConfigExtension));
        if(configFile.exists()) {
            try {
               runConfiguration =  mapper(configFile).map(RunConfiguration.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new RuntimeException("Cannot find configuration file : "+runConfigName);
        }
        return runConfiguration;
    }
}

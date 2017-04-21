package com.testvagrant.commons.helpers;

import cucumber.api.Scenario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScenarioHelper {

    private Scenario scenario;
    private Matcher matcher;

    public ScenarioHelper(Scenario scenario) {
        this.scenario = scenario;
        matcher = getMatcher();
    }

    public String getUniqueScenarioName() {
        String scenarioNameString = matcher.group(3);
        if (Character.isDigit(scenarioNameString.charAt(scenarioNameString.length() - 1))) {
            String outlineCount = scenarioNameString.split(";;")[1];
            return scenarioNameString.split(";;")[0] + "-" + (Integer.parseInt(outlineCount) - 1);
        }
        return scenarioNameString;
    }

    private Matcher getMatcher() {
        Pattern p = Pattern.compile("((.*?);)(.*)(;;[0-9+])?");
        Matcher matcher = p.matcher(scenario.getId());

        matcher.find();
        return matcher;
    }


    public String getParentFeatureName() {
        return matcher.group(2);
    }
}

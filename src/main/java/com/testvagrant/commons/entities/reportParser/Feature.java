package com.testvagrant.commons.entities.reportParser;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.json.JSONObject;

import java.util.List;
import java.util.stream.Collectors;

public class Feature {

    private JsonObject featureObject;
    private String name;

    public Feature(JsonObject featureObject) {
        this.featureObject = featureObject;
    }

    public boolean hasBackground() {
        JsonArray scenarioArray = featureObject.get("elements").getAsJsonArray();
        return scenarioArray.get(0).getAsJsonObject().get("type").getAsString().equalsIgnoreCase("background");
    }

    public JsonArray getScenarioArray() {
        return featureObject.get("elements").getAsJsonArray();

    }


    public List<JSONObject> even(List<JSONObject> list) {
        if (list.isEmpty()) {
            throw new Error();
        }
        List<JSONObject> toRemove = list.stream().filter(jsonObject -> list.indexOf(jsonObject) % 2 == 1).collect(Collectors.toList());

        list.removeAll(toRemove);
        return list;
    }
}

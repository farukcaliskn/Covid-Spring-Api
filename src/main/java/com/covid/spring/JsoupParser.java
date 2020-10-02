package com.covid.spring;

import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;

public class JsoupParser {

    static ArrayList<String> getCountry(String country) {
        ArrayList<String> value = new ArrayList<>();
        Document doc = null;
        try {
            doc = org.jsoup.Jsoup.connect("https://www.worldometers.info/coronavirus/country/" + country).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            if (doc != null)
                value.add(doc.select("div.maincounter-number").get(i).select("span").text());
        }
        return value;
    }

}

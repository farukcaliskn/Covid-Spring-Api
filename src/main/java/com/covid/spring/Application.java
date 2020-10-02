package com.covid.spring;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;


@SpringBootApplication
public class Application {
    static ArrayList<String> value = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        getCountry("turkey");
    }

    static void getCountry(String country) {
        Document doc = null;
        try {
            doc = Jsoup.connect("https://www.worldometers.info/coronavirus/country/" + country).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 3; i++) {
            if (doc != null)
                value.add(doc.select("div.maincounter-number").get(i).select("span").text());
        }
    }

}

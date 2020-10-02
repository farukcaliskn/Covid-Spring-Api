package com.covid.spring;

import com.covid.spring.models.Cases;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
class CountryController {
    /*
    @GetMapping("/country")
    @ResponseBody
    public Cases countryData() {
        return new Cases(Application.value.get(0), Application.value.get(1), Application.value.get(2));
    }*/

    @RequestMapping(value = "cases", method = RequestMethod.GET)
    public @ResponseBody
    Cases getItem(@RequestParam("country") String country) {
        String cases = JsoupParser.getCountry(country).get(0);
        String deaths = JsoupParser.getCountry(country).get(1);
        String recovered = JsoupParser.getCountry(country).get(2);
        return new Cases(cases, deaths, recovered);
    }
}

package com.covid.spring;

import com.covid.spring.models.Country;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
class CountryController {
    JsoupParser parser = JsoupParser.getInstance();

    @RequestMapping(value = "cases", method = RequestMethod.GET)
    public @ResponseBody
    Country getItem(@RequestParam("country") String country) {
        String cases = parser.getCountry(country).get(0);
        String deaths = parser.getCountry(country).get(1);
        String recovered = parser.getCountry(country).get(2);
        return new Country(country, cases, deaths, recovered);
    }
}

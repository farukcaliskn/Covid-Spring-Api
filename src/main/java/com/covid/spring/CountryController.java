package com.covid.spring;

import com.covid.spring.models.Cases;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
class CountryController {
    @GetMapping("/country")
    @ResponseBody
    public Cases countryData() {
        return new Cases(Application.value.get(0), Application.value.get(1), Application.value.get(2));
    }
}

package com.anwen.pharmacy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    RestClientController restClient;

    @GetMapping("/calculateValue")
    public String calculate(@RequestParam("firstVal") String firstVal, @RequestParam("secVal") String secondVal, Model model){
        model.addAttribute("firstVal", firstVal);
        model.addAttribute("secondVal", secondVal);
        System.out.println(firstVal + "&&" + secondVal);
        System.out.println(restClient.makeRequest());
        return "calculateValue";
    }
}

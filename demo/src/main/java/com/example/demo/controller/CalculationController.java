package com.example.demo.controller;

import com.example.demo.bean.Calculation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculationController {

    @GetMapping("/addCalculation")
    public String sendForm(Calculation calculation){

        return "addCalculation";
    }

    @PostMapping("/addCalculation")
    public String processForm(Calculation calculation){

        int i = Integer.parseInt(calculation.getNumberOne());
        int o = Integer.parseInt(calculation.getNumberTwo());
        int sum = i + o;
        
        calculation.setSum(String.valueOf(sum));

        return "showMessage";
    }
}
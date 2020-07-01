package by.company.controller;

import by.company.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/calc")
public class CalcController {

    @GetMapping
    public String calculation(@RequestParam Double digit1,
                              @RequestParam Double digit2,
                              @RequestParam String operation,
                              Model model){
        model.addAttribute("firstDigit",digit1);
        model.addAttribute("secondDigit",digit2);
        model.addAttribute("myOperation",operation);
        Double res = Calculator.calculate(digit1,digit2,operation);
        model.addAttribute("calcResult",res);
        return "calc";
    }
}

package by.company.controller;

import by.company.service.CalcService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/calc")
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String form(){
        return "calc";
    }

    @PostMapping
    public String calculation(@RequestParam Double digit1,
                              @RequestParam Double digit2,
                              @RequestParam String operation,
                              Model model){
        Double res = calcService.calculate(digit1,digit2,operation);
        model.addAttribute("calcResult",res);
        return "calc";
    }
}

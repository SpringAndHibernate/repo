package by.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/logout")
public class LogOutController {

    @GetMapping
    public String logout(HttpSession httpSession){
        httpSession.setAttribute("myCheck",false);
        return "menu";
    }
}

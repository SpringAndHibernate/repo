package by.company.controller;

import by.company.model.User;
import by.company.service.UService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    private final UService uService;

    public UserController(UService uService) {
        this.uService = uService;
    }

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @GetMapping("/auth")
    public String auth(){
        return "auth";
    }

    @PostMapping("/reg")
    public String reg(User user, Model model){
        uService.add(user);
        model.addAttribute("message","SUCCESSFUL REGISTRATION!");
        return "menu";
    }

    @PostMapping("/auth")
    public String auth(User user,HttpSession httpSession, Model model){
        uService.checkRegistration(user);
        model.addAttribute("message","SUCCESSFUL AUTHORIZATION!");
        httpSession.setAttribute("myCheck",true);
        return "menu";
    }

}

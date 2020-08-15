package com.ymktb.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    @RequestMapping("/")
    public String home(Map<String, Object> model){

        Map map = new HashMap<String,String>();
        map.put("test","test app");
        map.put("app-version" , appVersion);
        model.put("message", map);
        return "home";

    }

    @GetMapping
    @RequestMapping("/user")
    public String userMenu(Map<String, Object> model){

        Map map = new HashMap<String,String>();
        map.put("test","test app");
        map.put("app-version" , appVersion);
        model.put("message", map);
        return "user";

    }
    @GetMapping
    @RequestMapping("/admin")
    public String adminMenu(Map<String, Object> model){

        Map map = new HashMap<String,String>();
        map.put("test","test app");
        map.put("app-version" , appVersion);
        model.put("message", map);
        return "admin";

    }

    @RequestMapping()
    public String myAction()
    {
        /* your logic here */
        return "redirect:userNews";
    }

    @GetMapping
    @RequestMapping("/userNews")
    public String userNews(Model model, @RequestParam(value="name") String name){

       name = "kemal";
        model.addAttribute("name", name);

        return "newsUser";

    }

}

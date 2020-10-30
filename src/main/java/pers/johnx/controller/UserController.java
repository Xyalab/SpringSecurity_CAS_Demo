package pers.johnx.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getName")
    public String demo(){

        String name = SecurityContextHolder.getContext().getAuthentication().getName();

        return name;

    }


}

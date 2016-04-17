package com.server.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Контроллер, возвращающий страницу помощи
 */
@Controller
public class HelpController {

    @RequestMapping("help")
    public ModelAndView getHelpPage(){
        return new ModelAndView("help");
    }
}

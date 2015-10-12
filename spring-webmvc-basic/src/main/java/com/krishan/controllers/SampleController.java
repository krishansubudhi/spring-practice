package com.krishan.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by krishan on 10/11/15.
 */
@Controller
public class SampleController {

    @RequestMapping(value = "/", method = GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/home", method = GET)
    public String homeAgain(){
        return "home";
    }
}

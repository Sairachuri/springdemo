package com.springdemo.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {



        @RequestMapping("/hello maven")
        @ResponseBody

        // Method
        public String helloGFG()
        {
            return "Hello springboot";
        }
    }



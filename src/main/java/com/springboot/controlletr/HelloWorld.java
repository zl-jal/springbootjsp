package com.springboot.controlletr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by test
 * date:  2019/12/2.
 */
@Controller
public class HelloWorld {

    @RequestMapping("/test")
    public String test(){

        return "success";
    }

}

package com.example.web;

import com.example.utils.DateUtils;
import com.example.utils.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/hello")
    public String say(){
        return "time：" + DateUtils.getCurDate().toString();
    }

    @GetMapping("/getRandom")
    public String getRandom(){
        return "time：" + RandomUtils.getRandom();
    }

}

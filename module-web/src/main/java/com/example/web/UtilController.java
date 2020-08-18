package com.example.web;

import com.example.utils.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/util")
public class UtilController {

    @GetMapping("/getRandom")
    public String getRandom(){
        return "time：" + RandomUtils.getUUID();
    }

}

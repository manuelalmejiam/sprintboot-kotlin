package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloKot {
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "HelloWorl") name:String):String{
        return if(name.compareTo("Cris")==0)
              "Hello ${name}, instage Telegram"
         else
             "Hello ${name} "
    }
}
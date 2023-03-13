package com.wildcodeschool.DoctorController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @ GetMapping ( "/docteur/1" )
    @ ResponseBody
     public String index1 (){

        return  "William Hartnell" ;
    }

    @ GetMapping ( "/docteur/10" )
    @ ResponseBody
    public String index2 (){

        return "David Tennant" ;
    }

    @ GetMapping ( "/docteur/13" )
    @ ResponseBody
    public String index (){
        return  "Jodie Whittaker" ;
    }

}
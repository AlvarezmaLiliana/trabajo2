/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.alvarez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author lili
 */
@Controller
public class AlvarezController {
   @GetMapping({"/","hola"})
   public String hola(){
       return "hola liliana alvarez";
   }
}

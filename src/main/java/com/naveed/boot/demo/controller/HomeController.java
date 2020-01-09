/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 9, 2020
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}

package com.akshaybijawe.jokeapp.controllers;

import com.akshaybijawe.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author arbijawe on 3/1/18
 * @project joke-app
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";

    }
}

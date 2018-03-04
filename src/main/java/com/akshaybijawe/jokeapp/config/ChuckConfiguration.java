package com.akshaybijawe.jokeapp.config;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author arbijawe on 3/4/18
 * @project joke-app
 */
//@Configuration
public class ChuckConfiguration {

   // @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}

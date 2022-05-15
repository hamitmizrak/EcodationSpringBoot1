package com.hamitmizrak.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


public class _02_Security{

}

//@EnableWebSecurity
//public class _02_Security extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        //super.configure(http);
//        //http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//        http
//                    .authorizeRequests()
//                    .anyRequest()
//                    .authenticated()
//                .and()
//                    .formLogin()
//                .and();
//    }


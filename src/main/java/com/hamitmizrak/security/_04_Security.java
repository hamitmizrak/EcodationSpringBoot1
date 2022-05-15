package com.hamitmizrak.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class _04_Security {

}

//
//@EnableWebSecurity
//public class _04_Security extends WebSecurityConfigurerAdapter {
//
//
//    @Autowired
//    public void ramazanAddUser(AuthenticationManagerBuilder managerBuilder) throws Exception{
//        PasswordEncoder passwordEncoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
//        managerBuilder
//                .inMemoryAuthentication() //cache bellek data olsun
//                .withUser("root")
//                .password(passwordEncoder.encode("root"))
//                .roles("ADMIN");
//    }
//}

package com.hamitmizrak.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;


public class _06_Security{

}

//@EnableWebSecurity
//public class _06_Security extends WebSecurityConfigurerAdapter {
//   // @Autowired
//    //PasswordEncoder passwordEncoder;
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//       http
//               .authorizeRequests()
//               .antMatchers("/","/index","/success","/login")
//               .permitAll()
//               .anyRequest()
//               .authenticated();
//    }
//
//
//    @Autowired
//    public void ramazanAddUser(AuthenticationManagerBuilder managerBuilder) throws Exception{
//        managerBuilder
//                .inMemoryAuthentication() //cache bellek data olsun
//                .withUser("ramazan")
//                .password("{noop}root")
//                .roles("ADMIN");
//    }
//}

//package com.example.vms.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
////
////        http
////                .authorizeRequests()//所有security全注解配置实现的开端，表示开始说明需要的权限  第一部分：拦截的路径     第二部分：访问该路径需要的权限
//////				.antMatchers("/user/login").hasRole("zx")
////                .antMatchers("/**").permitAll()         //antMatchers   拦截路径    permitAll任何权限都可以进行访问 .hasAnyAuthority   特殊权限才可访问
////                .anyRequest().authenticated()                       //anyRequest    任何的请求   authenticated   认证后才可访问
////                .and().csrf().disable();                            //必要参数（固定写法）    使csrf拦截失效
//
//        http
//                .authorizeRequests()
//                .antMatchers("/**").permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .permitAll();
//    }
//
////    @Override
////    public void configure(final WebSecurity web) throws Exception {
////        web.ignoring()
////                .antMatchers("/doc.html/**");
////    }
//
//}
//
//

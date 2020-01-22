package com.atguigu.gmall.organization.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2020/1/22 23:07
 */
@Configuration
@EnableWebSecurity //启用了，中间放行也不可以。
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/**").permitAll();
        http.csrf().disable();//这个必须开启，不然是403
    }
}

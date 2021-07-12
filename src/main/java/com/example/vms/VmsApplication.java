package com.example.vms;

//import com.example.vms.config.CrosFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class VmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VmsApplication.class, args);
    }

    /**
     * 配置跨域访问的过滤器
     * @return
     */
//    @Bean
//    public FilterRegistrationBean registerFilter(){
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//        bean.addUrlPatterns("/*");
//        bean.setFilter(new CrosFilter());
//        return bean;
//    }
}

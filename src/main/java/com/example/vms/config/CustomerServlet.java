//package com.example.vms.config;
//import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
//import org.springframework.context.annotation.Bean;
//
//public class CustomerServlet implements EmbeddedServletContainerCustomizer {
//
//    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
//        configurableEmbeddedServletContainer.setPort(9090); //1
//        configurableEmbeddedServletContainer.setContextPath("/test"); //2
//    }
//    @Bean
//    public EmbeddedServletContainerFactory servletContainer(){
//        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
//        factory.setPort(9999);
//        factory.setContextPath("/test");
//        return factory;
//    }
//}

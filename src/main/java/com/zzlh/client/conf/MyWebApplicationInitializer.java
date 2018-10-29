package com.zzlh.client.conf;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Description TODO
 * @author liulei
 * @date 2018年10月29日 下午2:41:03
 */
//@Configuration
//@EnableWebMvc
public class MyWebApplicationInitializer  {

/* implements WebApplicationInitializer   
 * @Override
    public void onStartup(ServletContext servletCxt) {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConf.class);
        ac.refresh();
        
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("client", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }*/
}

package com.zzlh.client.conf;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Description TODO
 * @author liulei
 * @date 2018年10月29日 下午3:51:45
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
		servletContext.addListener(SingleSignOutHttpSessionListener.class);
	}
	
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { MyWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] {new DelegatingFilterProxy("singleSignOutFilter"),
        		new DelegatingFilterProxy("authenticationFilter"),
        		new DelegatingFilterProxy("cas10TicketValidationFilter"),
        		new DelegatingFilterProxy("httpServletRequestWrapperFilter")};
    }
}

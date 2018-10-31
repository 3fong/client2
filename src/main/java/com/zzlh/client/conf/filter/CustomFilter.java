package com.zzlh.client.conf.filter;

import org.jasig.cas.client.authentication.AuthenticationFilter;
import org.jasig.cas.client.session.SingleSignOutFilter;
import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.jasig.cas.client.util.HttpServletRequestWrapperFilter;
import org.jasig.cas.client.validation.Cas10TicketValidationFilter;
import org.jasig.cas.client.validation.Cas10TicketValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @author liulei
 * @date 2018年10月31日 下午12:27:23
 */
@Configuration
public class CustomFilter {

	@Bean("singleSignOutFilter")
	public SingleSignOutFilter createSingleSignOutFilter() {
		SingleSignOutFilter filter = new SingleSignOutFilter();
		filter.setCasServerUrlPrefix("https://cas.apicaddy.com:8443/cas");
		return filter;
	}
	
	@Bean("authenticationFilter")
	public AuthenticationFilter createAuthenticationFilter() {
		AuthenticationFilter filter = new AuthenticationFilter();
		filter.setCasServerLoginUrl("https://cas.apicaddy.com:8443/cas");
		filter.setService("https://app1.cas.com:7443/client");
		return filter;
	}
	
	@Bean("cas10TicketValidationFilter")
	public Cas10TicketValidationFilter createCas10TicketValidationFilter() {
		Cas10TicketValidator validator = new Cas10TicketValidator("https://cas.apicaddy.com:8443/cas");
		Cas10TicketValidationFilter filter = new Cas10TicketValidationFilter();
		filter.setTicketValidator(validator);
		filter.setService("https://app1.cas.com:7443/client");
		return filter;
	}
	
	@Bean("httpServletRequestWrapperFilter")
	public HttpServletRequestWrapperFilter createHttpServletRequestWrapperFilter() {
		HttpServletRequestWrapperFilter filter = new HttpServletRequestWrapperFilter();
		return filter;
	}
	

}

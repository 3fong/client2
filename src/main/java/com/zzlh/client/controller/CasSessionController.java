package com.zzlh.client.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description TODO
 * @author liulei
 * @date 2018年10月29日 下午2:02:38
 */

@Controller
public class CasSessionController {

	/*
	 * @RequestMapping("/logout") public void logout(HttpServletRequest request,
	 * HttpServletResponse response) throws IOException {
	 * response.sendRedirect("https://cas.apicaddy.com:8443/cas/logout");
	 * HttpSession session = request.getSession(false); session.invalidate();
	 * Cookie[] cookies = request.getCookies(); if(cookies!=null&&cookies.length>0)
	 * { for (Cookie cookie : cookies) { cookie.setMaxAge(0);
	 * cookie.setDomain("app1.cas.com"); cookie.setPath("/client");
	 * response.addCookie(cookie); } } }
	 */

	@RequestMapping("/logout")
	public String loginOut(HttpSession session) {
		session.invalidate();
		return "redirect:https://cas.apicaddy.com:8443/cas/logout?service=https://app1.cas.com:7443/client";
	}

}

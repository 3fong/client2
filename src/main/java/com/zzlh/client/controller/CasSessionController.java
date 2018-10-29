package com.zzlh.client.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzlh.client.util.HttpUtil;

/**
 * @Description TODO
 * @author liulei
 * @date 2018年10月29日 下午2:02:38
 */

@RestController
public class CasSessionController {

	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpUtil.doGet("https://cas.apicaddy.com:8443/cas/logout");
		HttpSession session = request.getSession(false);
		session.invalidate();
		session.removeAttribute("id");
		Cookie[] cookies = request.getCookies();
		if(cookies!=null&&cookies.length>0) {
			for (Cookie cookie : cookies) {
				cookie.setMaxAge(0);
				cookie.setDomain("app1.cas.com");
				cookie.setPath("/client");
				response.addCookie(cookie);
			}
		}
		response.sendRedirect("/client");
	}
}

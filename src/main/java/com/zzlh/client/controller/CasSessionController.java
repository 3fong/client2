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

	@RequestMapping("/logout")
	public String loginOut(HttpSession session) {
		session.invalidate();
		return "redirect:https://cas.apicaddy.com:8443/cas/logout?service=https://app1.cas.com:7443/client";
	}

}

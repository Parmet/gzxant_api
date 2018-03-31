package com.gzxant.gzxant_api.business.system.user.v1.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gzxant.gzxant_api.common.mvc.BaseController;
import com.gzxant.gzxant_api.common.request.R;

@RestController
@RequestMapping("/sys/v1/user")
public class SysUserController extends BaseController {

	@ResponseBody
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public R get(@ModelAttribute("id") String id) {
		r.setState(0);
		r.setMessage("msg");
		return r;
	}
}

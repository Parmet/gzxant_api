package com.gzxant.gzxant_api.business.system.role.v1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gzxant.gzxant_api.common.mvc.BaseController;
import com.gzxant.gzxant_api.common.request.R;

@RestController
@RequestMapping("/sys/v1/role")
public class SysRoleController extends BaseController {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public R get() throws Exception {
		throw new Exception("get fail");
	}
}

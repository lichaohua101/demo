package com.gxuc.hcsmis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gxuc.hcsmis.bean.Account;
import com.gxuc.hcsmis.service.AccountService;

import javax.annotation.Resource;
@Controller
/**
 * 定义在类上时 value = "list" 
 * 类似于   /manager/user/list
 * @author Administrator
 *webapp.WEB-INF.jsp\manager.user
 */

@RequestMapping("/manager/user/*")
public class AccountController {
	
	/**
	 * spring扫描自动命名机制-将类的首字母小写当做name
	 * https://blog.csdn.net/xiamen_buyu/article/details/80647303
	 */
	@Resource(name = "accountService")
	private AccountService accountService;
	
	@RequestMapping(value = "edit" ,method = RequestMethod.GET)
	public String add(@RequestParam("id") int id /*,Account account*/) {
		/*accountService.update(account);*/
		return "";
	}
}

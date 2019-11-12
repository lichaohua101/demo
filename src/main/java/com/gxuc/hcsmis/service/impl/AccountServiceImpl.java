package com.gxuc.hcsmis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gxuc.base.repository.PurviewRepository;
import com.gxuc.base.repository.RoleRepository;
import com.gxuc.hcsmis.bean.Account;
import com.gxuc.hcsmis.repository.AccountRepository;
import com.gxuc.hcsmis.service.AccountService;
import com.gxuc.service.BaseServiceImpl;

@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account, Integer> implements AccountService {
	@Resource
	private AccountRepository accountRepository;
	@Resource
	private PurviewRepository purviewRepository;
	@Resource
	private RoleRepository roleRepository;

	@Override
	public Account findByMobile(String mobile) {
		return accountRepository.findByMobile(mobile);
	}

	@Override
	public List<Account> findByAffiliation(Integer id) {
		return accountRepository.findByAffiliation(id);
	}

	@Override
	public List<Account> findByAffiliationAndOrgId(int i, String orgId) {
		
		return accountRepository.findByAffiliationAndOrgId(i,orgId);
	}

	@Override
	public List<Integer> findByOrgIdAndPid(int pId) {
		
		return accountRepository.findByOrgIdAndPid(pId);
	}

}

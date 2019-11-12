package com.gxuc.hcsmis.service;

import java.util.List;

import com.gxuc.hcsmis.bean.Account;
import com.gxuc.service.BaseService;

public interface AccountService extends BaseService<Account, Integer> {

	/**
	 * 根据号码查询
	 * @param mobile
	 * @return
	 */
	Account findByMobile(String mobile);

	/**
	 * 根据所属机构获取
	 * @param id
	 * @return
	 */
	List<Account> findByAffiliation(Integer id);

	/**
	 * 根据所属机构和局向获取
	 * @param i
	 * @param orgId
	 * @return
	 */
	List<Account> findByAffiliationAndOrgId(int i, String orgId);

	List<Integer> findByOrgIdAndPid(int pId);

}

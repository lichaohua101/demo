package com.gxuc.hcsmis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.gxuc.hcsmis.bean.Account;
import com.gxuc.repository.BaseRepository;

/**
 * 类似 mapper
 * @author Administrator
 *
 */
public interface AccountRepository extends BaseRepository<Account, Integer> {

	/**
	 * 根据用户名查找帐号
	 * 
	 * @param username
	 * @return
	 */
	public Account findByUsername(String username);

	/**
	 * 根据号码查询
	 * 
	 * @param mobile
	 * @return
	 */
	public Account findByMobile(String mobile);

	/**
	 * 根据所属机构获取
	 * 
	 * @param id
	 * @return
	 */
	public List<Account> findByAffiliation(Integer affiliation);

	public List<Account> findByAffiliationAndOrgId(int i, String orgId);

	/**
	 * 根据部门ID和权限ID查询
	 * 
	 * @param orgId
	 * @param pId
	 * @return
	 */
	@Query(value = "SELECT rid FROM base_role_purview WHERE pid=?1", nativeQuery = true)
	public List<Integer> findByOrgIdAndPid(int pId);
}

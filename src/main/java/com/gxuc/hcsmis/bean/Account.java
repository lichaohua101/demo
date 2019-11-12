package com.gxuc.hcsmis.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.gxuc.util.ComUtil;
/**
 * (account)账户
 * @author Administrator
 *
 */
@Entity
@Table(name = "hcsmis_account")
public class Account implements Serializable {

	/**
	 * 移动人员账号
	 */
	private static final long serialVersionUID = 8993165316689301859L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(length = 20)
	private String username;// 登陆名
	@Column(length = 20)
	private String realname;// 真实姓名

	private String password;// 密码
	private String mobile;// 电话号码
	private String roleIds;// 角色ID
	private String cityId;// 市级
	private String cityName;// 市级
	private String orgId;// 部门ID
	private String orgName;// 部门名称

	private Integer type;// 人员类型
	private Integer affiliation;// 所属机构：1.县公司 2.网运 3.客响 4一线人员

	private Date createTime;// 帐号创建时间
	
	//表示该属性并非一个到数据库表的字段的映射,
	@Transient
	private List<Integer> roleIdList;

	@Transient
	private Set<Integer> pids = new HashSet<Integer>();// 用户权限ID

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(Integer affiliation) {
		this.affiliation = affiliation;
	}

	public List<Integer> getRoleIdList() {
		if (roleIdList == null) {
			roleIdList = new ArrayList<Integer>();
			if (roleIds != null && roleIds.length() > 0) {
				String[] ids = roleIds.split(",");
				for (String id : ids) {
					roleIdList.add(ComUtil.getInt(id.trim()));
				}
			}
		}
		return roleIdList;
	}

	public void setRoleIdList(List<Integer> roleIdList) {
		this.roleIdList = roleIdList;
	}

	public Set<Integer> getPids() {
		return pids;
	}

	public void setPids(Set<Integer> pids) {
		this.pids = pids;
	}

}

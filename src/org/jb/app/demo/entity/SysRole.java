package org.jb.app.demo.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * SysRole generated by MyEclipse - Hibernate Tools
 */

public class SysRole  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 168590958691641945L;
	private Long roleId;
     private String roleName;
     private String roleDesc;
     private Integer roleFlag;
     private Set users = new HashSet(0);
     private List rights = new ArrayList(0);


    // Constructors

    /** default constructor */
    public SysRole() {
    }

	/** minimal constructor */
    public SysRole(String roleName) {
        this.roleName = roleName;
    }
    
    /** full constructor */
    public SysRole(String roleName, String roleDesc, Integer roleFlag, Set sysUserRoles, List rights) {
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.roleFlag = roleFlag;
        this.users = sysUserRoles;
        this.rights = rights;
    }

   
    // Property accessors

    public Long getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return this.roleDesc;
    }
    
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Integer getRoleFlag() {
        return this.roleFlag;
    }
    
    public String getRoleFlagString() {
        String ret = "";
        if (this.roleFlag==null){
        	return ret;
        }
    	switch(this.roleFlag){
    	case 0: ret = "已删除";break;
    	case 1: ret = "正常";break;
    	}
    	return ret;
    }
    
    public void setRoleFlag(Integer roleFlag) {
        this.roleFlag = roleFlag;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }

    public List getRights() {
        return this.rights;
    }
    
    public void setRights(List rights) {
        this.rights = rights;
    }
   








}
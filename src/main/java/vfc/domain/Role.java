package vfc.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	private String rolename;
	
	@OneToMany(targetEntity = User.class)
	@JoinColumn(name="role_id")
	private List<User> user;

	public Role(){}

	public int getRoleId() {
		return roleId;
	}

	
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}

package com.datafoundry.loginUserService.model;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "permissions")
public class PermissionEntity {
	
	@Id
    @Column(name="id")
    private String permissionID;
	
	@Column(name="module_name")
	String moduleName;
	
	@Column(name="module_display_name")
	String moduleDisplayName;
	
	@Column(name="microservice_name")
	String microServiceName;
	
	@Column(name="redirect_url")
	String redirectURL;
	
	@Column(name="privilege")
	int privilege;
	
	@Column(name="group_name")
	String groupName;
	
	@Column(name="host_name")
	String hostName;
	
	@Column(name="icon")
	String icon;
	
	

	public PermissionEntity(String moduleName, String moduleDisplayName, String microServiceName,
			String redirectURL, int privilege, String groupName, String hostName, String icon) {
		super();
		UUID uuid = UUID.randomUUID();
		this.permissionID = uuid.toString();
		this.moduleName = moduleName;
		this.moduleDisplayName = moduleDisplayName;
		this.microServiceName = microServiceName;
		this.redirectURL = redirectURL;
		this.privilege = privilege;
		this.groupName = groupName;
		this.hostName = hostName;
		this.icon = icon;
	}
	
	public PermissionEntity()
	{
		UUID uuid = UUID.randomUUID();
		this.permissionID = uuid.toString();
	}

	public String getId() {
		return permissionID;
	}

	public void setId(String id) {
		this.permissionID = id;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleDisplayName() {
		return moduleDisplayName;
	}

	public void setModuleDisplayName(String moduleDisplayName) {
		this.moduleDisplayName = moduleDisplayName;
	}

	public String getMicroServiceName() {
		return microServiceName;
	}

	public void setMicroServiceName(String microServiceName) {
		this.microServiceName = microServiceName;
	}

	public String getRedirectURL() {
		return redirectURL;
	}

	public void setRedirectURL(String redirectURL) {
		this.redirectURL = redirectURL;
	}

	public int getPrivilege() {
		return privilege;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName, hostName, icon, permissionID, microServiceName, moduleDisplayName, moduleName, privilege,
				redirectURL);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PermissionEntity other = (PermissionEntity) obj;
		return Objects.equals(groupName, other.groupName) && Objects.equals(hostName, other.hostName)
				&& Objects.equals(icon, other.icon) && Objects.equals(permissionID, other.permissionID)
				&& Objects.equals(microServiceName, other.microServiceName)
				&& Objects.equals(moduleDisplayName, other.moduleDisplayName)
				&& Objects.equals(moduleName, other.moduleName) && privilege == other.privilege
				&& Objects.equals(redirectURL, other.redirectURL);
	}

	@Override
	public String toString() {
		return "Permissions [permissionID=" + permissionID + ", moduleName=" + moduleName + ", moduleDisplayName=" + moduleDisplayName
				+ ", microServiceName=" + microServiceName + ", redirectURL=" + redirectURL + ", privilege=" + privilege
				+ ", groupName=" + groupName + ", hostName=" + hostName + ", icon=" + icon + "]";
	}
	
	
}

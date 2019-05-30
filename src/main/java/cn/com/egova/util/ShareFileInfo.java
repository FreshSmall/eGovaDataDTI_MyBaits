package cn.com.egova.util;

import java.util.HashSet;
import java.util.Set;

/**
 * 共享目录信息
 * @author yindl
 *
 */
public class ShareFileInfo{

	private String serverName;
	private String userName;
	private String password;
	private String sharePath;
	private String virtualDir;
	private Set<String> proxyDir = new HashSet<String>();

	public String getServerName(){
		return serverName;
	}

	public void setServerName(String serverName){
		this.serverName = serverName;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getSharePath(){
		return sharePath;
	}

	public void setSharePath(String sharePath){
		this.sharePath = sharePath;
	}

	public String getVirtualDir(){
		return virtualDir;
	}

	public void setVirtualDir(String virtualDir){
		this.virtualDir = virtualDir;
	}

	public Set<String> getProxyDir(){
		return proxyDir;
	}

	public void setProxyDir(Set<String> proxyDir){
		this.proxyDir = proxyDir;
	}
}

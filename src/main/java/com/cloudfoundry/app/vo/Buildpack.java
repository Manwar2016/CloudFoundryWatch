package com.cloudfoundry.app.vo;

import org.springframework.stereotype.Component;

public class Buildpack {

	private String guid;
	private String name;
	private String position;
	private String fileName;
	private boolean isLocked;
	private String createdAt;
	private String updatedAt;
	
	public Buildpack(String guid, String name, String position, String fileName, boolean isLocked, String createdAt,
			String updatedAt) {
		super();
		this.guid = guid;
		this.name = name;
		this.position = position;
		this.fileName = fileName;
		this.isLocked = isLocked;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public boolean isLocked() {
		return isLocked;
	}
	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}

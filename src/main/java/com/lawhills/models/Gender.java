package com.lawhills.models;

public enum Gender {
	MALE("male"),
	FEMALE("female");
	
	private final String displayName;
	
	Gender(String displayName){
		this.displayName = displayName;
	}
	public String getDisplayName() {
		return displayName;
	}
}

package com.sanket.JobListing.Model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobListing")
public class Posts {
	private String profile;
	private String desc;
	private int exp;
	private String techs[];
	//Constructor
	public Posts() {
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
	@Override
	public String toString() {
		return "Posts [profile=" + profile + ", desc=" + desc + ", exp=" + exp + ", techs=" + Arrays.toString(techs)
				+ "]";
	}
	
	
	
	
}

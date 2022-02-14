package com.cg.app.testing.service;

import com.cg.app.testing.repo.AppRepo;

public class AppService {
	
	private AppRepo repo;
	
	

	public AppRepo getRepo() {
		return repo;
	}



	public void setRepo(AppRepo repo) {
		this.repo = repo;
	}



	public String addItem(String itemName,int quantity) {
		String output;
		if(quantity>0) {
			repo.addItem();
			output = "Added Successfully";
		}
		else {
			output = "Operation Failed";
		}
		return output;
	}
	
}

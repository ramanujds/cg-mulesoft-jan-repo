package com.cg.employeeapp;

import com.cg.employeeapp.ui.EmployeeUi;

public class EmployeeAppMain {

	public static void main(String[] args) {
		
		EmployeeUi uiObj = new EmployeeUi();
		
		while(true) {
			uiObj.showMenu();
		}
		
	}

}

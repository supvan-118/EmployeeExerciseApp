package com.capg.empapp.execptions;

public class InvalidEmployeeIdExcption extends Exception {
	
	public String toString() {
		 return "InvalidEmployeeException:- The ID entered is not a valid ID ";
	}
}

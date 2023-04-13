package com.rays.pro4.exception;
/**
 * RecordNotFoundException thrown when a record not found occurred.
 * 
 * @author Sumesh Sharma
 * 
 */
public class RecordNotFoundException extends Exception {
	public RecordNotFoundException(String msg){
		super(msg);
	}
}

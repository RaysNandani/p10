package com.rays.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 * Nandani kumbhkar 
 */
public class DuplicateRecordException extends RuntimeException {

	/**
	 * @param msg
	 *            error message
	 */
	public DuplicateRecordException(String msg) {          //Unchecked exception
		super(msg);
	}

}
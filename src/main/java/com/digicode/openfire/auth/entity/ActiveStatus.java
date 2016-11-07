package com.digicode.openfire.auth.entity;

/**
 * Created by tymoshenkol on 07-Nov-16.
 */
public enum ActiveStatus {
	ACTIVE(1),INACTIVE(0);

	private int status;
	ActiveStatus (int i) {status = i;}

	public boolean isActive(){
		return this.equals(ACTIVE);
	}
}

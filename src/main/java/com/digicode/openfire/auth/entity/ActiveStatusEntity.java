package com.digicode.openfire.auth.entity;

import lombok.Data;

/**
 * Created by tymoshenkol on 07-Nov-16.
 */
@Data
public class ActiveStatusEntity {
	ActiveStatus status;
	public boolean isActive(){
		return this.status.isActive();
	}
}

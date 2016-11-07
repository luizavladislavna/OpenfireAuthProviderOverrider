package com.digicode.openfire.auth.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by tymoshenkol on 07-Nov-16.
 */
@Data
public class UserSubscribtion {
	List<Subscription> rooms;
	List<Subscription> communities;
}

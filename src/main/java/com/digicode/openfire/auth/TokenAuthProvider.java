package com.digicode.openfire.auth;

import com.digicode.openfire.auth.entity.UserDetails;
import lombok.extern.slf4j.Slf4j;
import org.jivesoftware.openfire.auth.AuthProvider;
import org.jivesoftware.openfire.auth.ConnectionException;
import org.jivesoftware.openfire.auth.InternalUnauthenticatedException;
import org.jivesoftware.openfire.auth.UnauthorizedException;
import org.jivesoftware.openfire.user.UserNotFoundException;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * Created by tymoshenkol on 07-Nov-16.
 */
@Slf4j
public class TokenAuthProvider implements AuthProvider {

	protected boolean authenticateByUserToken(String token){
		UserDetails details = null;

		/*
		* Write custom authentication code here. Based on it, user is authenticated.
		*
		* details = getFrom Groupee API
		* return nonNull(details) && details.isActive();
		*/

		//TODO: false by default
		return true;
	}
	public void authenticate (String userName, String passWord) throws UnauthorizedException, ConnectionException, InternalUnauthenticatedException {

		boolean isUserAuthorized = false;
		log.debug("authenticate() - starts");

		if(isNull(userName)){
			throw new UnauthorizedException();
		}

		if(nonNull(userName)){
			isUserAuthorized = authenticateByUserToken(userName);
		}

		log.debug("userName: {}; passWord: {}", userName, passWord);
		log.debug("authenticate() - ends");

		if (isUserAuthorized == false) {
			throw new UnauthorizedException();
		}
	}

	public void authenticate (String arg0, String arg1, String arg2) throws UnauthorizedException, ConnectionException, InternalUnauthenticatedException {
		throw new UnauthorizedException();
	}

	public String getPassword (String arg0) throws UserNotFoundException, UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public boolean isDigestSupported () {
		return false;
	}

	public boolean isPlainSupported () {
		return true;
	}

	public void setPassword (String arg0, String arg1) throws UserNotFoundException, UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public boolean supportsPasswordRetrieval () {
		return false;
	}


	public boolean isScramSupported () {
		return false;
	}
}
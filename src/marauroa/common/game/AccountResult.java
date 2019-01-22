/* $Id: AccountResult.java,v 1.6 2010/04/30 20:50:35 nhnb Exp $ */
/***************************************************************************
 *						(C) Copyright 2003 - Marauroa					   *
 ***************************************************************************
 ***************************************************************************
 *																		   *
 *	 This program is free software; you can redistribute it and/or modify  *
 *	 it under the terms of the GNU General Public License as published by  *
 *	 the Free Software Foundation; either version 2 of the License, or	   *
 *	 (at your option) any later version.								   *
 *																		   *
 ***************************************************************************/
package marauroa.common.game;

/**
 * This class represent the result of creating an account. It will also contains
 * the generated username and the generated RPObject, so we can inform client
 * about changes on username and/or RPObject.
 * 
 * @author miguel
 * 
 */
public class AccountResult {

	/** The result of creating the account */
	private Result result;

	/**
	 * The username generated by the create account process. It will usually be
	 * the same that the username requested.
	 */
	private String username;

	/**
	 * Constructor
	 * 
	 * @param result
	 *            the result of creating the account.
	 * @param username
	 *            the username generated.
	 */
	public AccountResult(Result result, String username) {
		this.result = result;
		this.username = username;
	}

	/**
	 * Returns the result of creating the account
	 * 
	 * @return the result of creating the account
	 */
	public Result getResult() {
		return result;
	}

	/**
	 * Returns the username generated by create account.
	 * 
	 * @return the username generated by create account.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Returns true if the creation of the account failed.
	 * @return true if the creation of the account failed.
	 */
	public boolean failed() {
		return result.failed();
	}

	@Override
	public String toString() {
		return "AccountResult [result=" + result + ", username=" + username
				+ "]";
	}

}

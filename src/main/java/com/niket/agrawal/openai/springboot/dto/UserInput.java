package com.niket.agrawal.openai.springboot.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class UserInput {

	String userCommand;

	/**
	 * @return the userCommand
	 */
	public String getUserCommand() {
		return userCommand;
	}

	/**
	 * @param userCommand the userCommand to set
	 */
	public void setUserCommand(String userCommand) {
		this.userCommand = userCommand;
	}

}

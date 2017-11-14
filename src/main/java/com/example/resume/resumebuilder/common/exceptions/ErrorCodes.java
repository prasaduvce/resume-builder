package com.example.resume.resumebuilder.common.exceptions;

public enum ErrorCodes {

	NULL_REQUEST("Request object is null"),
	INVALID_REQUEST("Request object is invalid"),
	USER_AUTHENTICATION_FAILED( "User authentication failed"),
	LOGGED_IN_HEADER_IS_NULL("trv-authorized header is null"),
	BOOKING_CORE_SAVE_API_ERROR("Exception while saving booking core data"),
	FIELD_IS_NOT_UNIQUE("Value should be unique"),
	UNHANDLED_EXCEPTION_IN_BOOKING("Unhandled exception while booking, please contact booking team");

	private final String description;

	ErrorCodes( String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}

package com.example.resume.resumebuilder.common.exceptions;

import com.example.resume.resumebuilder.dtos.ErrorInfo;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;

public class AppException extends RuntimeException {

	private HttpStatus httpStatus;

	private String businessErrorCode;

	private List<ErrorInfo> errors;

	/**
	 * This is the common exception thrown for booking for single error code.
	 * @param message user defined exception message.
	 * @param httpStatus HttpStatus to return to the user.
	 * @param businessErrorCode to return to the front end.
	 */
	public AppException(String message, HttpStatus httpStatus, String businessErrorCode) {
		super(message);
		this.httpStatus = httpStatus;
		this.businessErrorCode = businessErrorCode;
		this.errors = Arrays.asList(new ErrorInfo(businessErrorCode, message));
	}

	/**
	 * This is the exception thrown with multiple error codes.
	 * @param message user defined exception message.
	 * @param httpStatus HttpStatus to return to the user.
	 * @param businessErrors to return to the front end.
	 */
	public AppException(String message, HttpStatus httpStatus, List<ErrorInfo> businessErrors) {
		super(message);
		this.httpStatus = httpStatus;
		this.errors = businessErrors;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public String getBusinessErrorCode() {
		return businessErrorCode;
	}

	public List<ErrorInfo> getErrors() {
		return errors;
	}
}

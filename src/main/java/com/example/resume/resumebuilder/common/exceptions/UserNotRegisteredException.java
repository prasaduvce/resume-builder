package com.example.resume.resumebuilder.common.exceptions;

import com.example.resume.resumebuilder.dtos.ErrorInfo;
import java.util.List;
import org.springframework.http.HttpStatus;

public class UserNotRegisteredException extends AppException {

	public UserNotRegisteredException(String message, HttpStatus httpStatus, String businessErrorCode) {
		super(message, httpStatus, businessErrorCode);
	}

	public UserNotRegisteredException(String message, HttpStatus httpStatus, List<ErrorInfo> businessErrors) {
		super(message, httpStatus, businessErrors);
	}
}

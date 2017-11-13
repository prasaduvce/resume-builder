package com.example.resume.resumebuilder.common.aspects;


import static com.example.resume.resumebuilder.common.exceptions.ErrorCodes.INVALID_REQUEST;

import com.example.resume.resumebuilder.common.exceptions.AppException;
import com.example.resume.resumebuilder.common.exceptions.ErrorCodes;
import com.example.resume.resumebuilder.common.exceptions.UserNotRegisteredException;
import com.example.resume.resumebuilder.dtos.ErrorInfo;
import com.example.resume.resumebuilder.dtos.ErrorResponse;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

	private static final Function<FieldError, ErrorInfo> FIELD_ERROR_TO_ERROR_INFO_MAPPER = fieldError -> new ErrorInfo(INVALID_REQUEST.name(), fieldError.getField() + ": " + fieldError.getDefaultMessage());

	private static final Logger log = LoggerFactory.getLogger(ControllerExceptionHandler.class);

	/**
	 * Handler method for argument validations.
	 * @param ex when booking request is invalid.
	 * @return error response with error code and message.
	 */
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		List<FieldError> errors = ex.getBindingResult().getFieldErrors();
		log.warn("MethodArgumentNotValidException caught, field errors: {} ", errors);
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorInfos(errors.stream().map(FIELD_ERROR_TO_ERROR_INFO_MAPPER).collect(Collectors.toList()));
		return errorResponse;
	}

	/**
	 * Handler method for message not readable exceptions.
	 * @param ex when booking request is null.
	 * @return error response with error code and message.
	 */
	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
		log.warn("HttpMessageNotReadableException caught, error message: {} ", ex.getMessage());
		ErrorResponse errorResponse = new ErrorResponse();
		ErrorInfo errorInfo = new ErrorInfo(ErrorCodes.NULL_REQUEST.name(), ErrorCodes.NULL_REQUEST.getDescription());
		errorResponse.setErrorInfos(Arrays.asList(errorInfo));
		return errorResponse;
	}

	/**
	 * To handle user not authorized exception.
	 * @param userNotRegisteredException when request header "trv-authorized" is false.
	 * @return error response with error code and message.
	 */
	@ExceptionHandler(value = UserNotRegisteredException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public ErrorResponse handleUserNotAuthorizedException(UserNotRegisteredException userNotRegisteredException) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorInfos(userNotRegisteredException.getErrors());
		return errorResponse;
	}

	/**
	 * To handle booking exceptions.
	 * @param appException when booking exception is thrown.
	 * @return error response with error code and message.
	 */
	@ExceptionHandler(value = AppException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse handleBookingException(AppException appException) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorInfos(appException.getErrors());
		return errorResponse;
	}

	/**
	 * To handle default exception.
	 * @param exception when exception is thrown.
	 * @return error response with error code and message.
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse handleException(Exception exception) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorInfos(Arrays.asList(new ErrorInfo(ErrorCodes.UNHANDLED_EXCEPTION_IN_BOOKING.name(), "Exception message: " + exception.getMessage() + ", Error Description " + ErrorCodes.UNHANDLED_EXCEPTION_IN_BOOKING.getDescription())));
		return errorResponse;
	}
}

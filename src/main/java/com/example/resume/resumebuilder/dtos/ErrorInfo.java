package com.example.resume.resumebuilder.dtos;

import java.util.Objects;

public class ErrorInfo {

	private String errorCode;

	private String errorMessage;

	public ErrorInfo(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ErrorInfo)) {
			return false;
		}
		ErrorInfo errorInfo = (ErrorInfo) o;
		return Objects.equals(getErrorCode(), errorInfo.getErrorCode()) &&
			   Objects.equals(getErrorMessage(), errorInfo.getErrorMessage());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getErrorCode(), getErrorMessage());
	}

	@Override
	public String toString() {
		return "ErrorInfo{" +
			   "errorCode='" + errorCode + '\'' +
			   ", errorMessage='" + errorMessage + '\'' +
			   '}';
	}
}

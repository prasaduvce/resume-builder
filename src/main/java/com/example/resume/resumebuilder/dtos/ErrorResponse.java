package com.example.resume.resumebuilder.dtos;

import java.util.List;

public class ErrorResponse {
	private List<ErrorInfo> errorInfos;

	public List<ErrorInfo> getErrorInfos() {
		return errorInfos;
	}

	public void setErrorInfos(List<ErrorInfo> errorInfos) {
		this.errorInfos = errorInfos;
	}
}

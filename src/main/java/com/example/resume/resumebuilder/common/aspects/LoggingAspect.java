package com.example.resume.resumebuilder.common.aspects;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut(value = "@within(org.springframework.web.bind.annotation.RestController) && execution(* com.example.resume.resumebuilder.controllers.*.*(..))")
	public void controllerMethods() {

	}

	/**
	 * Aspect method to print request and response.
	 * Method to log booking request.
	 * @param proceedingJoinPoint to proceed to the next join point.
	 * @return response of the endpoint.
	 */
	@Around(value = "controllerMethods()")
	public Object logRequestAndResponse(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		String apiEndPoint = getApiEndPoint(proceedingJoinPoint);
		Object[] arguments = proceedingJoinPoint.getArgs();
		log.info("Invoking endpoint {} , request is {} ", apiEndPoint, getArguments(arguments));
		Object response = null;
		try {
			response = proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			log.error("Exception while Invoking endpoint {} , exception is {} ", apiEndPoint, throwable.getMessage());
			throw throwable;
		}
		log.info("Response from the endpoint {}, response is {} ", apiEndPoint, response);
		return response;
	}

	private String getArguments(Object[] arguments) {
		final StringBuilder stringBuilder = new StringBuilder();
		if (arguments != null && arguments.length > 0) {
			Arrays.stream(arguments).forEach(o -> {
				stringBuilder.append(o.getClass().getName());
				stringBuilder.append(" : ");
				stringBuilder.append(o);
				stringBuilder.append("\n");
			});
		}
		return stringBuilder.toString();
	}

	private String getApiEndPoint(JoinPoint jp) {
		MethodSignature ms = (MethodSignature) jp.getSignature();
		String[] mappings = ms.getMethod().getAnnotation(RequestMapping.class).value();
		return Arrays.stream(mappings).findAny().isPresent() ? mappings[0] : null;
	}

}

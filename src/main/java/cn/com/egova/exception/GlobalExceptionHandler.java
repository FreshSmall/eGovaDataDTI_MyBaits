package cn.com.egova.exception;

import cn.com.egova.bean.ResultInfo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.*;


@ControllerAdvice
public class GlobalExceptionHandler {


	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public ResultInfo handle(MethodArgumentNotValidException exception) {
		ResultInfo result = new ResultInfo(false);
		System.out.println(exception.getMessage());
		BindingResult bindingResult = exception.getBindingResult();
		System.out.println(bindingResult.getFieldError().getField());
		List<FieldError> fieldErrors =  bindingResult.getFieldErrors();
		List<ObjectError> objectList = bindingResult.getAllErrors();
		Map<String, Object> errorParam = new HashMap<String, Object>();
		for (int i = 0; fieldErrors != null && i < fieldErrors.size(); i++) {
			FieldError objectError = fieldErrors.get(i);
			errorParam.put(objectError.getField(), objectError.getDefaultMessage());
		}

		result.addData("errorInfo", errorParam);
		return result;
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResultInfo handle(Exception e){
		ResultInfo result = new ResultInfo(false);
		result.setMessage(e.getMessage());
		return result;
	}
}

package guru.springframework.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(NumberFormatException.class)
	public ModelAndView handleNumberFormatException(NumberFormatException nfe) {
		log.error("Handling not found exception " + nfe.getMessage());
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("error/400");
		modelAndView.addObject("error", nfe.getMessage());

		return modelAndView;
	}
}

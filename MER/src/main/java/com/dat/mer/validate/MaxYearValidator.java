package com.dat.mer.validate;
import java.time.Year;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MaxYearValidator implements ConstraintValidator<MaxYear,String> {
	@Override
	 public void initialize(MaxYear maxYear) {
	    }
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
	if(value=="" || value==null || value.length()<4 || value.length()>4) {
			return true;
		}
		else if(value.matches("\\D+")){
			return false;
		}
		int year=Integer.parseInt(value);
		int currentYear=Year.now().getValue();
		return year<=currentYear;
	}
}

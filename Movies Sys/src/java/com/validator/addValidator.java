/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validator;

import com.pojo.MovieItem;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author root
 */
public class addValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return type.isAssignableFrom(MovieItem.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      ValidationUtils.rejectIfEmptyOrWhitespace(errors,"title", "error.title.required", "title required");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors,"actor", "error.actor.required", "actor required");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors,"actress", "error.actress.required", "actress required");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors,"genre", "error.genre.required", "genre required");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors,"year", "error.year.required", "year required");
      
//      if(errors.hasErrors())
//          return;
//      MovieItem movie= (MovieItem) o;
    }
    
}

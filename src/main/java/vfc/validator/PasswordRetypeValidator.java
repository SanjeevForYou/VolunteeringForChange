package vfc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import vfc.domain.Credentials;

@Component
public class PasswordRetypeValidator implements Validator {

	@Override
	public boolean supports(Class<?> claz) {
		return Credentials.class.isAssignableFrom(claz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"required.password", "Field name is required.");

			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword",
					"required.confirmPassword", "Field name is required.");

			Credentials pwd = (Credentials)target;

			if(!(pwd.getPassword().equals(pwd.getVerifyPassword()))){
				errors.rejectValue("credentials.password", "vfc.validator.message");
			}		
	}

}

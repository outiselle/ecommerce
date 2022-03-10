package it.rea.ecommerce.payload.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import it.rea.ecommerce.utils.PasswordMatch;
import it.rea.ecommerce.utils.ValidEmail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@PasswordMatch
public class UserDto {
		
	@Size(max=10, min=3, message="Username length must be between 3 and 10 chars")
	@NotBlank(message="Username must not be blank")
	private String username;
	
	@Size(max=50, min=3, message="Firstname length must be between 3 and 10 chars")
	@NotBlank(message="Firstname must not be blank")
	private String firstname;
	
	@Size(max=50, min=3, message="Lastname length must be between 3 and 10 chars")
	@NotBlank(message="Lastname must not be blank")
	private String lastname;
		
	@ValidEmail
	@NotNull(message="Email must not be blank")
	@NotEmpty(message="Email must not be blank")
	private String email;
		
	@Size(max=32, min=6, message="Password length must be between 6 and 32 chars")
	@NotBlank(message="Password must not be blank")
	private String password;
	private String matchPassword;
	// 123456
	
}

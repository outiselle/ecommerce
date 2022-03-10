package it.rea.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, length = 10, unique = true)
	@Size(min = 3, max = 10)
	private String username;
	
	@Column(nullable = false, length = 30)
	private String firstname;

	@Column(nullable = false, length = 30)
	private String lastname;
	
	@Column(nullable = false, length = 150, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	// 123456

}

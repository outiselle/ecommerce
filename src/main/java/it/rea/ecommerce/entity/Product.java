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
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, length = 30, unique = true)
    @Size(min = 5, max = 30)
	private String pName;
	
	@Column(nullable = false, length = 150, unique = true)
    @Size(min = 20, max = 150)
	private String pDesc;
	
	@Column(nullable = false)
	private float price;

}

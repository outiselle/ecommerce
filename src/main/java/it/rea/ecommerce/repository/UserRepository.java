package it.rea.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.rea.ecommerce.entity.User;
import it.rea.ecommerce.payload.dto.UserDto;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	boolean existsByUsername(String username);
	boolean existsByEmail(String email);
	

}

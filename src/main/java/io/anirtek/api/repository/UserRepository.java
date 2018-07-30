package io.anirtek.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import io.anirtek.api.entity.User;

public interface UserRepository extends Repository<User, String> {

	public List<User> findAll();

	public Optional<User> findById(String id);
	
	public Optional<User> findByEmail(String email);

	public User save(User user); // doing update as well as insert

	public void delete(User user);
}

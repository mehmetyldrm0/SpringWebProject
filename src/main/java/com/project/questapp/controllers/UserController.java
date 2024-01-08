package com.project.questapp.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.questapp.entities.User;
import com.project.questapp.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	private UserService userService;
	

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping // getrimek için
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping // create etmek için kullanılır
	public User createUser(@RequestBody User newUser) {
		return userService.saveUserService(newUser);
		
	}
	
	@GetMapping("/{userId}") 
	public User getOneUser(@PathVariable Long userId, @RequestBody User newUser) {
		// custom exception
		return userService.getOneUser(userId);
	}
	
	@PutMapping("/{userId}") 
	public User uptadeOneUser(@PathVariable Long userId, @RequestBody User newUser) {
		return userService.updateOneUser(userId,newUser);
	
	}
	
	@DeleteMapping("/{userId}") 
	public void deleteOneUser(@PathVariable Long userId) {
		userService.deleteById(userId);
	}
	
}
package com.example.demo.service;

import com.example.demo.model.User;

public interface IUserService  {
	User registerUser(User user);

	User login(String username, String password);

	User forgotPassword(User user);

}

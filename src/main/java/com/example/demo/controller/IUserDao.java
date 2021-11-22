package com.example.demo.controller;

import com.example.demo.model.User;

public interface IUserDao {
	User registerUser(User user);

	User login(String username, String password);

	User forgotPassword(User user);

}

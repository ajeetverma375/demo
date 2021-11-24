//package com.example.demo.service;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.exception.IncorrectLoginCredentialsException;
//import com.example.demo.model.User;
//import com.example.demo.repository.IUserRepository;
//
//@Service
//public class UserService implements IUserService {
//
//	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
//
//	@Autowired
//	private IUserRepository userRepository;
//
//
//	@Override
//	public User forgotPassword(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User registerUser(User user) {
//		LOG.info("register");
//		if (userRepository.findByUserName(user.getUserName()) != null) {
//			LOG.info("Already Exist");
//			throw new UserAlreadyExistsException("Username Already Exist");
//		} else {
//			return userRepository.save(user);
//		}
//	}
//
//	@Override
//	public User login(String username, String password)  {
//		User user = null;
//
//		if (userRepository.existsByUserName(username)
//				&& userRepository.findByUserName(username).get().getAdminPassword().equals(password)) {
//			user = userRepository.findByUserName(username).get();
//			LOG.info("Admin login is  successfull");
//			return user;
//		}
//		LOG.error("Admin details are incorrect");
//		throw new IncorrectLoginCredentialsException("Invalid Credentials");
//	}
//
//	// ----------------------------------------------------------------------------------------------------------------
//
////		public User login(String userName,String password) {
////			User user = usRepository.findByUserName(userName);
////			if (user.) {
////			   User	user = usRepository.findByUserName(userName);
////			   
////				if (!usRepository.findByPassword(user.getUserPassword()).equals(password)) {
////					LOG.info("Success");
////				}
////				else {
////					throw new IncorrectLoginCredentialsException("jhnjhvdjhvj");
////				}
////			}
////			else {
////				throw new IncorrectLoginCredentialsException("dhjvbdivbuidfivuddf");
////			}
//
////		}
//
//	public User forgotPassword(User user) {
//
//		Optional<User> userOptional = Optional.ofNullable(userRepository.findByUserName(user));
//
//		if (!userOptional.isPresent()) {
//			return "Invalid email id";
//		}
//
//		User ur = userOptional.get();
//
//		ur = usRepository.save(ur);
//
//	}
//}

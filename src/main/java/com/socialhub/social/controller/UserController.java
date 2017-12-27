package com.socialhub.social.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import com.socialhub.social.model.User;
import com.socialhub.social.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 */
@RestController
public class UserController {

  private final UserRepository repository;

  public UserController(@Autowired UserRepository userRepository) {
    this.repository = userRepository;
  }

  @RequestMapping(value = "/users", method = POST, consumes = APPLICATION_JSON_VALUE)
  @CrossOrigin("*")
  public User createUser(User user) {
    String id = UUID.randomUUID().toString();
    user.setId(id);
    this.repository.save(user);
    return user;
  }
}

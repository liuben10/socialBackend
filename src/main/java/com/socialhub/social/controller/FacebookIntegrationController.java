package com.socialhub.social.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import com.socialhub.social.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
public class FacebookIntegrationController {

  @RequestMapping(value = "/create", method = POST)
  @CrossOrigin("*")
  public void create(@RequestBody User user) {

  }
}

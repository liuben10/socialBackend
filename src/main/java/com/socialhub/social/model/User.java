package com.socialhub.social.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import java.util.Map;

/**
 */
@Data
public class User {

  @Id
  private String id;

  private String userName;

  private String firstName;

  private String lastName;

  private Integer age;

  private String description;

  Map<SocialType, Object> socialAccounts;
}

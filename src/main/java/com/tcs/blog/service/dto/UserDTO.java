package com.tcs.blog.service.dto;


import com.tcs.blog.model.user.Address;
import com.tcs.blog.model.user.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO defined to only hold user personal information
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
    private Long postCount;
}

package com.jwt.example.Model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Entity
public class User {


//    @Id
    String userId;
    String userName;
//    String password;
    String email;
//    String role;
}

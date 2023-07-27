package com.microsrvc.usersrvc.entitites;

import jakarta.persistence.*;
import lombok.Data;

//@Entity()
//@Table(name = "user")// telling the spring application( spring data jpa) that this class has to be mapped to a database object
@Data()    // add all getter,setter,toString ,etc
public class User {

//    @Id()
//    @GeneratedValue()
    private int id;

//    @Column()
  private String username;
//
//    @Column()
private String email;
//
//    @Column()
private String password;


}

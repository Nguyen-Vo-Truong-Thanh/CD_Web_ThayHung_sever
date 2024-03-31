package vn.edu.hcmuaf.nvtt.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String username;
//    @Column(name = "password")
    String password;

    String phoneNumber;
//    @Column(name = "email")/
    String email;
//    @Column(name = "address")

    String address;
}

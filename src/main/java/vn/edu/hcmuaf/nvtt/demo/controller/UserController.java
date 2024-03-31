package vn.edu.hcmuaf.nvtt.demo.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.hcmuaf.nvtt.demo.entity.UserEntity;
import vn.edu.hcmuaf.nvtt.demo.services.UserServiceImpl;

@RestController
@RequestMapping({"/api/v1/products"})
/*
GET /api/v1/users
GET /api/v1/users/1
GET /api/v1/users/2
 */
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping({"/{id}"})
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        UserEntity entity = this.userService.findById(id);
        return ResponseEntity.ok(entity);
    }



}

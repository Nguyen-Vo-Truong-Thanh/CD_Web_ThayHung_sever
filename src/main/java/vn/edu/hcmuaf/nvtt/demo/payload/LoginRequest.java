package vn.edu.hcmuaf.nvtt.demo.payload;

import lombok.Data;

@Data
public class LoginRequest {

    private String username;
    private String password;
}

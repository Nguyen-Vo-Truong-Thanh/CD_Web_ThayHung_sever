package vn.edu.hcmuaf.nvtt.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import vn.edu.hcmuaf.nvtt.demo.payload.LoginRequest;
import vn.edu.hcmuaf.nvtt.demo.payload.LoginResponse;

public interface UserService extends UserDetailsService {
    public LoginResponse login(LoginRequest loginRequest);
}

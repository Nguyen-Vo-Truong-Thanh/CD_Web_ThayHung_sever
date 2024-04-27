package vn.edu.hcmuaf.nvtt.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.edu.hcmuaf.nvtt.demo.payload.LoginRequest;
import vn.edu.hcmuaf.nvtt.demo.payload.LoginResponse;
import vn.edu.hcmuaf.nvtt.demo.entity.UserEntity;
import vn.edu.hcmuaf.nvtt.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        UserEntity userEntity = userRepository.findByUsername(username);
        return new User(userEntity.getUsername(),userEntity.getPassword(),userEntity.getAuthorities());
    }

    public UserEntity findById(Long id){
        return userRepository.findById(id).orElseThrow(()->{
            throw  new IllegalArgumentException("Not found by id "+id);
        });
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        LoginResponse.builder().phoneNumber("324").email("asd").passWord("ayh").build();
        return null;
    }
}

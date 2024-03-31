package vn.edu.hcmuaf.nvtt.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.hcmuaf.nvtt.demo.entity.UserEntity;
import vn.edu.hcmuaf.nvtt.demo.repository.UserRepository;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public UserEntity findById(Long id){
        return userRepository.findById(id).orElseThrow(()->{
            throw  new IllegalArgumentException("Not found by id "+id);
        });
    }
}

package vn.edu.hcmuaf.nvtt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.hcmuaf.nvtt.demo.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
        public UserEntity findByUsername(String username);


}

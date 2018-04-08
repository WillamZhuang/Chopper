package com.dushsoft.study.cloud.repository;

/**
 * Created by Jobba on 2018/4/8.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dushsoft.study.cloud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

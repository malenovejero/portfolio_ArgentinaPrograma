package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author malen
 */
@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    public User findByUsername(String username);
    
}

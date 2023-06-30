
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 * @author malen
 */

@Repository
public interface AboutRepository extends JpaRepository <About, Long> {
   
    
}

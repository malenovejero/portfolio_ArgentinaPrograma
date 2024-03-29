
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Long>{
    
}

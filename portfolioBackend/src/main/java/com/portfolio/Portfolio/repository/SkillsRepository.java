
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Long>{
    
}

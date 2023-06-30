
package com.portfolio.Portfolio.repository;

import com.portfolio.Portfolio.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository <Projects, Long>{
    
}

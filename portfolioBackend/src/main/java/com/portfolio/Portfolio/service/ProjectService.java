
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Projects;
import com.portfolio.Portfolio.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectsService{
    
    @Autowired
    public ProjectsRepository projRepo;

    @Override
    public List<Projects> search() {
        return projRepo.findAll();     }
    
}

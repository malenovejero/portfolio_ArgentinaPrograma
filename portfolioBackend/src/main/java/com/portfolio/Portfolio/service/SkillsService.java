
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Skills;
import com.portfolio.Portfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository skillsRepo;

    @Override
    public List<Skills> search() {
        return skillsRepo.findAll();
    }
    
}

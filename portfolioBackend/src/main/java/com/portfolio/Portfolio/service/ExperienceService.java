
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Experience;
import com.portfolio.Portfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository exRepo;
    
    @Override
    public void save(Long id, Experience ex) {
        Experience experienceInfo = exRepo.findById(id).orElse(null);
        experienceInfo.setPhotoUrl(ex.getPhotoUrl());
        experienceInfo.setTitle(ex.getTitle());
        experienceInfo.setDate(ex.getDate());
        experienceInfo.setDescription(ex.getDescription());
        exRepo.save(experienceInfo);
    }
    
    @Override
    public void create(Experience ex) {
        Experience experienceInfo = new Experience();
        experienceInfo.setPhotoUrl(ex.getPhotoUrl());
        experienceInfo.setTitle(ex.getTitle());
        experienceInfo.setDate(ex.getDate());
        experienceInfo.setDescription(ex.getDescription());
        exRepo.save(experienceInfo);
    }

    @Override
    public List<Experience> search() {
       return exRepo.findAll();
    }
    
    @Override
    public Experience searchExp(Long id) {
       return exRepo.findById(id).orElse(null);
    }
    
    @Override
    public void deleteExp(Long id){
        exRepo.deleteById(id);
    }
    
}

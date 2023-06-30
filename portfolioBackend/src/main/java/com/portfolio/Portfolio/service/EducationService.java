
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Education;
import com.portfolio.Portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author malen
 */
@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository edRepo;

    @Override
    public void save(Long id, Education ed) {
        Education educationInfo = edRepo.findById(id).orElse(null);
        educationInfo.setPhotoUrl(ed.getPhotoUrl());
        educationInfo.setTitle(ed.getTitle());
        educationInfo.setDate(ed.getDate());
        educationInfo.setDescription(ed.getDescription());    }

    @Override
    public List<Education> search() {
        return edRepo.findAll();    }

    @Override
    public Education searchEd(Long id) {
        return edRepo.findById(id).orElse(null);    }
    
}

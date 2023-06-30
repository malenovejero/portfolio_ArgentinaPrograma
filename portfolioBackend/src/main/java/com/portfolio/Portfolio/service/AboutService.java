package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.About;
import com.portfolio.Portfolio.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AboutService implements IAboutService {

    @Autowired
    public AboutRepository abRepo;
    
    @Override
    public void save(Long id, About ab) {
        About aboutInfo = abRepo.findById(id).orElse(null);
        aboutInfo.setImageLink(ab.getImageLink());
        aboutInfo.setNameSurname(ab.getNameSurname());
        aboutInfo.setLocation(ab.getLocation());
        aboutInfo.setEmail(ab.getEmail());
        aboutInfo.setProfession(ab.getProfession());
        aboutInfo.setDescription(ab.getDescription());
        abRepo.save(aboutInfo);
    }

    @Override
    public About search(Long id) {
       return abRepo.findById(id).orElse(null);
    }
    
    
    
}

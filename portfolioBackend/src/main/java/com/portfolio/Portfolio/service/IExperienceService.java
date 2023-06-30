
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Experience;
import java.util.List;


public interface IExperienceService {
    public void save (Long id, Experience ex);
    
    public void create (Experience ex);
    
    public void deleteExp (Long id);
    
    public List<Experience> search ();
    
    public Experience searchExp(Long id);
    
}

package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.About;

public interface IAboutService {
    
    public void save (Long id, About ab);
    
    public About search (Long id);
    
}

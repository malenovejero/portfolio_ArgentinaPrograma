
package com.portfolio.Portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Projects {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imageUrl;
    private String title;
    private String date;
    @Column(name="description", length=3000)
    private String description;
    @Column(name="project_url", length=3000)
    private String projectUrl;
    
    public Projects (){}
    
    public Projects (Long id, String imageUrl, String title, String date, String description, String projectUrl){
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.date = date;
        this.description = description;
        this.projectUrl = projectUrl;
    }
    
    
}

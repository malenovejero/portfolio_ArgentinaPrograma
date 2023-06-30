
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
public class Education {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="photo_url", length=3000)
    private String photoUrl;
    private String title;
    private String date;
    @Column(name="description", length=3000)
    private String description;
    
    public Education(){}
    
    public Education (Long id, String photoUrl, String title, String date, String description){
        this.id = id;
        this.photoUrl = photoUrl;
        this.title = title;
        this.date = date;
        this.description = description;
    }
    
}

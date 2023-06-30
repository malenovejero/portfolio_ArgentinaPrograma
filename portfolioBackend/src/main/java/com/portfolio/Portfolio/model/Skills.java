
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
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="image_url", length=3000)
    private String imageUrl;
    private String title;
    
    public Skills() {}
    
    public Skills(Long id, String imageUrl, String title){
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
    }
    
}

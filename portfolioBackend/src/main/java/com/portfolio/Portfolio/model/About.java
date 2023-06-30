
package com.portfolio.Portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

/**
 * @author malen
 */
@Getter @Setter
@Entity

public class About {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Lob
    @Column(name="image_link", length=1500)
    private String imageLink;
    private String nameSurname;
    private String location;
    private String email;
    private String profession;
    @Lob
    @Column(name="description", length=1500)
    private String description;
    
    public About() {}

    public About(Long id, String imageLink, String nameSurname, String location, String email, String profession, String description){
        this.id = id;
        this.imageLink = imageLink;
        this.nameSurname = nameSurname;
        this.location = location;
        this.email = email;
        this.profession = profession;
        this.description = description;
        
    }
}


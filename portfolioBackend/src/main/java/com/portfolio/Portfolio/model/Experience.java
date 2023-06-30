
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
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Lob
    @Column(name="photo_url", length=1500)
    private String photoUrl;
    private String title;
    private String date;
    @Lob
    @Column(name="description", length=1500)
    private String description;
    
    public Experience(){}
    
    public Experience (Long id, String photoUrl, String title, String date, String description){
        this.id = id;
        this.photoUrl = photoUrl;
        this.title = title;
        this.date = date;
        this.description = description;
    }

}

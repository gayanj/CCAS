package com.ccas.models.entities;
// Generated May 29, 2015 10:57:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Advertisement generated by hbm2java
 */
public class Advertisement  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String type;
     private String path;
     private Set customercategories = new HashSet(0);

    public Advertisement() {
    }

	
    public Advertisement(String name, String type, String path) {
        this.name = name;
        this.type = type;
        this.path = path;
    }
    public Advertisement(String name, String type, String path, Set customercategories) {
       this.name = name;
       this.type = type;
       this.path = path;
       this.customercategories = customercategories;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    public Set getCustomercategories() {
        return this.customercategories;
    }
    
    public void setCustomercategories(Set customercategories) {
        this.customercategories = customercategories;
    }




}



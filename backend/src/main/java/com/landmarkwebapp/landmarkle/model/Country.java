package com.landmarkwebapp.landmarkle.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Country {
    @Id
    private String countryID;
    private String name;
    private String description;
    private String state;
    private String country;
}

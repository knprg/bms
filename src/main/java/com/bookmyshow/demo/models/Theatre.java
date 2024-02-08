package com.bookmyshow.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Theatre extends BaseModel {
    private String name;

    @OneToMany
    private List<Screen> screens;
}

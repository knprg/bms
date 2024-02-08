package com.bookmyshow.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;
    private String seatType;
    private int price;
}

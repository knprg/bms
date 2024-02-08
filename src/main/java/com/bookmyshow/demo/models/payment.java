package com.bookmyshow.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class payment extends BaseModel{
    private String refNo;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private PaymentGatewayProvider paymentGatewayProvider;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
}

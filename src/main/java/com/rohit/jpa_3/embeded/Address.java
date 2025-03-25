package com.rohit.jpa_3.embeded;


import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String streetNumber;
    private String location;
    private String state;
}
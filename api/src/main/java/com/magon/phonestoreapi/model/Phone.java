package com.magon.phonestoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Data
@Document
@AllArgsConstructor
public class Phone {
    @Id
    private String id;
    private Brand brand;
    private String model;
    private int storage;
    private DisplayType displayType;
    private double price;
    private OperatingSystem operatingSystem;
    private LocalDate releaseDate;
}

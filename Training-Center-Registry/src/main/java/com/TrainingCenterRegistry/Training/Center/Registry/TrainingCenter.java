package com.TrainingCenterRegistry.Training.Center.Registry;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.Address;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

// TrainingCenter.java



@Entity
public class TrainingCenter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Size(min = 12, max = 12)
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    private String centerCode;

    @Valid
    @Embedded
    private Address address;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @NotBlank
    @Email
    private String contactEmail;

    @NotBlank
    @Pattern(regexp = "\\d{10}")
    private String contactPhone;

}


package com.TrainingCenterRegistry;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.TrainingCenterService;
import com.TrainingCenterRegistry.Training.Center.Registry.TrainingCenter;

import jakarta.validation.Valid;

// TrainingCenterController.java


@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private final TrainingCenterService service;

    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter createdCenter = service.createTrainingCenter(trainingCenter);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCenter);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = service.getAllTrainingCenters();
        return ResponseEntity.ok(trainingCenters);
    } 
}

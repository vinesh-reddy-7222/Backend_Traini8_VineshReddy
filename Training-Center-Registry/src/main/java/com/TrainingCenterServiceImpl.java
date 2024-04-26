package com;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TrainingCenterRegistry.Training.Center.Registry.TrainingCenter;

// TrainingCenterServiceImpl.java
@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterServiceImpl(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    @Override
    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        // Perform any additional business logic or validation before saving
        return repository.save(trainingCenter);
    }

    @Override
    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
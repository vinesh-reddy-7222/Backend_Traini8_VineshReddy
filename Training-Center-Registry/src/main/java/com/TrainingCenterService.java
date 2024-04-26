package com;

import java.util.List;

import com.TrainingCenterRegistry.Training.Center.Registry.TrainingCenter;

// TrainingCenterService.java


public interface TrainingCenterService {
    TrainingCenter createTrainingCenter(TrainingCenter trainingCenter);
    List<TrainingCenter> getAllTrainingCenters();
}

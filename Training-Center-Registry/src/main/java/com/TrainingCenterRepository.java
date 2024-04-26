package com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TrainingCenterRegistry.Training.Center.Registry.TrainingCenter;

// TrainingCenterRepository.java

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
    
}

package com.example.K8s_DeploymentFailureAnalysis.repositories;

import com.example.K8s_DeploymentFailureAnalysis.models.PodLogs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepo extends MongoRepository<PodLogs, String> {
}

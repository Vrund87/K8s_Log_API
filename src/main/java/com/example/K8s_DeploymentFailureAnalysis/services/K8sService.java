package com.example.K8s_DeploymentFailureAnalysis.services;

import com.example.K8s_DeploymentFailureAnalysis.models.PodLogs;
import com.example.K8s_DeploymentFailureAnalysis.repositories.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class K8sService {
    @Autowired
    private LogRepo logRepo;
    public void storelogs(PodLogs podLogs){
        logRepo.save(podLogs);
    }

    public String connectionChecker(){
        return "Congratulations ! We are now family connected...";
    }

    public List<PodLogs> getAllentries(){
        return logRepo.findAll();
    }
}

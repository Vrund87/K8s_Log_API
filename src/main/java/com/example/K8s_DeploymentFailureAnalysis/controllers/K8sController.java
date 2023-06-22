package com.example.K8s_DeploymentFailureAnalysis.controllers;

import com.example.K8s_DeploymentFailureAnalysis.models.PodLogs;
import com.example.K8s_DeploymentFailureAnalysis.services.K8sService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class K8sController {
    @Autowired
    private K8sService k8sService;

    @PostMapping("/store-logs")
    public void storelog(@RequestBody PodLogs podLogs){
        System.out.println("Store request received...");
        k8sService.storelogs(podLogs);
        System.out.println("Stored...");
    }

    @GetMapping("/isConnected")
    public String connectionCheck(){
        return k8sService.connectionChecker();
    }

    @GetMapping("/getAllEntries")
    public List<PodLogs> getAllentries(){
        System.out.println("Get request received...");
        return k8sService.getAllentries();
    }
}

package com.example.K8s_DeploymentFailureAnalysis.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="PodLogs")
public class PodLogs {
    private String deployment_name;
    private String pod_name;
    private String namespace;
    private String container;
    private String node;
    private String CPU;
    private String memory;
    private String reason;
    private String message;
    private List<String> logs;

    public String getDeployment_name() {
        return deployment_name;
    }

    public void setDeployment_name(String deployment_name) {
        this.deployment_name = deployment_name;
    }

    public String getPod_name() {
        return pod_name;
    }

    public void setPod_name(String pod_name) {
        this.pod_name = pod_name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getLogs() {
        return logs;
    }

    public void setLogs(List<String> logs) {
        this.logs = logs;
    }

    @Override
    public String toString() {
        return "PodLog{" +
                "\"node_name\": \"" + node + "\", " +
                "\"deployment_name\": \"" + deployment_name + "\", " +
                "\"pod_name\": \"" + pod_name + "\", " +
                "\"namespace\": \"" + namespace + "\", " +
                "\"container\": \"" + container + "\", " +
                "\"reason\": \"" + reason + "\", " +
                "\"message\": \"" + message + "\", " +
                "\"CPU\": \"" + CPU + "\", " +
                "\"memory\": \"" + memory + "\", " +
                "\"logs\": \"" + logs + "\"}";
    }

}

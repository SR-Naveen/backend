package com.example.demoProject.Model; 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "protocol")
@JsonIgnoreProperties(ignoreUnknown = true) 
public class Protocol {

    @Id
    private String id; 

    @Column(name = "protocol_name")
    @JsonProperty("name")
    private String protocolName;

    @Column(name = "execution_date")
    @JsonProperty("rawDate")
    private String executionDate;

    @Column(name = "execution_time")
    @JsonProperty("rawTime")
    private String executionTime;

    @Column(name = "priority")
    private String priority;

    @Column(name = "channel")
    @JsonProperty("method")
    private String channel;

    @Column(name = "recurrence")
    @JsonProperty("repeat")
    private String recurrence;

    @Column(name = "category")
    private String category;

    // --- GETTERS & SETTERS ---
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getProtocolName() { return protocolName; }
    public void setProtocolName(String protocolName) { this.protocolName = protocolName; }

    public String getExecutionDate() { return executionDate; }
    public void setExecutionDate(String executionDate) { this.executionDate = executionDate; }

    public String getExecutionTime() { return executionTime; }
    public void setExecutionTime(String executionTime) { this.executionTime = executionTime; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }

    public String getRecurrence() { return recurrence; }
    public void setRecurrence(String recurrence) { this.recurrence = recurrence; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
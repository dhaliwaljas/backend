package com.weaver.taskservice.model.enitity;

//import org.springframework.

//import org.springframework.co

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Task {
	
	@Id
	private String id;
	private String title;
	private String description;
	private double creditValue;
	private String createdBy;
	private String assignedBy;
	private String assignedTo;
	private long initiallyDueAt;
	private long maxDueAt;
	private long currentlyDueAt;
	private long completedAt;
	private long createdAt;
	private long updatedAt;
	
	public Task() {
		super();
	}
	
//	UUID.randomUUID().toString()

	

	public Task(String id, String title, String description, double creditValue, String createdBy, String assignedBy,
			String assignedTo, long initiallyDueAt, long maxDueAt, long currentlyDueAt, long completedAt,
			long createdAt, long updatedAt) {
		super();
		
		this.id = id;
		this.title = title;
		this.description = description;
		this.creditValue = creditValue;
		this.createdBy = createdBy;
		this.assignedBy = assignedBy;
		this.assignedTo = assignedTo;
		this.initiallyDueAt = initiallyDueAt;
		this.maxDueAt = maxDueAt;
		this.currentlyDueAt = currentlyDueAt;
		this.completedAt = completedAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCreditValue() {
		return creditValue;
	}

	public void setCreditValue(double creditValue) {
		this.creditValue = creditValue;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public long getInitiallyDueAt() {
		return initiallyDueAt;
	}

	public void setInitiallyDueAt(long initiallyDueAt) {
		this.initiallyDueAt = initiallyDueAt;
	}

	public long getMaxDueAt() {
		return maxDueAt;
	}

	public void setMaxDueAt(long maxDueAt) {
		this.maxDueAt = maxDueAt;
	}

	public long getCurrentlyDueAt() {
		return currentlyDueAt;
	}

	public void setCurrentlyDueAt(long currentlyDueAt) {
		this.currentlyDueAt = currentlyDueAt;
	}

	public long getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(long completedAt) {
		this.completedAt = completedAt;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

}

package com.weaver.taskservice.model.request;

public class NewTask {
	private String title;
	private String description;
	private double creditValue;
	private String assignedTo;
	private long maxDueAt;
	private long initiallyDueAt;

	public NewTask() {
		super();
	}

	public NewTask(String title, String description, double creditValue, String assignedTo, long maxDueAt,
			long initiallyDueAt) {
		super();
		this.title = title;
		this.description = description;
		this.creditValue = creditValue;
		this.assignedTo = assignedTo;
		this.maxDueAt = maxDueAt;
		this.initiallyDueAt = initiallyDueAt;
	}

	@Override
	public String toString() {
		return "NewTask [title=" + title + ", description=" + description + ", creditValue=" + creditValue
				+ ", assignedTo=" + assignedTo + ", maxDueAt=" + maxDueAt + ", initiallyDueAt=" + initiallyDueAt + "]";
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

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public long getMaxDueAt() {
		return maxDueAt;
	}

	public void setMaxDueAt(long maxDueAt) {
		this.maxDueAt = maxDueAt;
	}

	public long getInitiallyDueAt() {
		return initiallyDueAt;
	}

	public void setInitiallyDueAt(long initiallyDueAt) {
		this.initiallyDueAt = initiallyDueAt;
	}

}

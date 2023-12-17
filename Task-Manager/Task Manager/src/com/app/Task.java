package com.app;

import java.time.LocalDate;

public class Task
{
	
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private String status;
	private boolean active;
	private static int idGenerator;
	
	static
	{
		idGenerator = 20;
	}
	
	
	public Task(String taskName, String description, LocalDate taskDate)
	{
		taskId = ++idGenerator;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = "PENDING";
		active = true;
		
	}


	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getTaskDate() {
		return taskDate;
	}


	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public static int getIdGenerator() {
		return idGenerator;
	}


	public static void setIdGenerator(int idGenerator) {
		Task.idGenerator = idGenerator;
	}


	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}
	
	
	
	
	
}

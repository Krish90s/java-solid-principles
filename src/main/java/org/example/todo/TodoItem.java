package org.example.todo;

import java.time.LocalDateTime;
import java.util.Date;


public class TodoItem {
	
	private static Integer counter = 0;
	private int id;
	private String description;
	private boolean isDeleted;
	private boolean isCompleted;
	private LocalDateTime createdAt;
	
	public TodoItem( String description) {
		this.id = ++counter;
		this.description = description;
		this.isDeleted = false;
		this.isCompleted = false;
		this.createdAt = LocalDateTime.now();
	}
	
	
	@Override
	public String toString() {
		return "TodoItem{" +
				"id=" + id +
				", description='" + description + '\'' +
				", isDeleted=" + isDeleted +
				", isCompleted=" + isCompleted +
				", createdAt=" + createdAt +
				'}';
	}
	
	public void markAsDeleted() {
		this.isDeleted = true;
	}
	
	public void markAsCompleted() {
		this.isCompleted = true;
	}
	
	public boolean isDeleted() {
		return isDeleted;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescription(){
		return description;
	}
	
	public boolean getCompleted() {
		return isCompleted;
	}
}

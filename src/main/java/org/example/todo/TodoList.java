package org.example.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
	
	private List<TodoItem> todoItemList;
	
	
	public TodoList() {
		this.todoItemList = new ArrayList<>();
	}
	
	public List<TodoItem> getTodoItemList() {
		return todoItemList;
	}
	
	public void addTodo (String description) {
		TodoItem todo = new TodoItem(description);
		todoItemList.add(todo);
	}
	
	public void printTodo () {
		todoItemList.forEach(System.out::println);
	}
	
	public List<TodoItem> getTodoList() {
		return todoItemList.stream()
				.filter(todoItem -> !todoItem.isDeleted())
				.collect(Collectors.toList());
	}
	
	public void markTodoAsDeleted(int id){
		todoItemList.stream()
				.filter(todoItem -> todoItem.getId() == id)
				.findFirst()
				.ifPresent(TodoItem::markAsDeleted);
	
	}
	
	
	public void markTodoAsComplete(int id){
		todoItemList.stream()
				.filter(todoItem -> todoItem.getId() == id)
				.findFirst()
				.ifPresent(TodoItem::markAsDeleted);
		
	}
	
	private TodoItem findTodoItemById(int id) {
		return todoItemList.stream()
				.filter(todoItem -> todoItem.getId() == id)
				.findFirst()
				.orElse(null);
	}
	
	private void deleteMany(List<Integer> ids) {
		todoItemList.stream()
				.filter(todoItem -> ids.contains(todoItem.getId()))
				.forEach(TodoItem::markAsDeleted);
	}
	
	private void completeMany(List<Integer> ids) {
		todoItemList.stream()
				.filter(todoItem -> ids.contains(todoItem.getId()))
				.forEach(TodoItem::markAsCompleted);
	}
	
	
	private void filterTodoList (String query, Boolean completed, int page, int pageSize ) {
		todoItemList.stream()
				.filter(todoItem ->
						(query == null || todoItem.getDescription().contains(query)
								|| (completed == null || todoItem.getCompleted()))
				).skip((long) (page - 1) * pageSize)
				.limit(pageSize)
				.collect(Collectors.toList());
	}
	
	
	
}

package org.example;

import org.example.canvas.Canvas;
import org.example.canvas.Circle;
import org.example.canvas.Rectangle;
import org.example.canvas.Triangle;
import org.example.todo.TodoItem;
import org.example.todo.TodoList;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		// canvas project execution
		
//		Circle circle = new Circle(5);
//		Triangle triangle = new Triangle(5, 6);
//		Rectangle rectangle = new Rectangle(4, 6);
//
//		Canvas canvas = new Canvas();
//
//		canvas.addShape(circle);
//		canvas.addShape(triangle);
//		canvas.addShape(rectangle);
//
//		System.out.println("circle area" + " "+ canvas.calculateArea(circle));
//		System.out.println("rectangle area" + " " + canvas.calculateArea(rectangle));
//		System.out.println("triangle area" + " "+ canvas.calculateArea(triangle));
		
		
		
		TodoList todoList = new TodoList();
		
		todoList.addTodo("wakeup at 5am");
		todoList.addTodo("workout for 45min");
		todoList.addTodo("read medium blog");
		
		System.out.println(todoList.getTodoList());
	}
	
	
}
package org.example.canvas;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	private  List<Shape> shapes;
	
	public Canvas() {
		this.shapes = new ArrayList<>();
	}
	
	public void addShape (Shape shape) {
		shapes.add(shape);
	}
	
	public double calculateArea(Shape shape){
		double totalArea = 0;
		
		for(Shape shape1 : shapes){
			totalArea += shape1.calculateArea();
		}
		
		return totalArea;
	}
}

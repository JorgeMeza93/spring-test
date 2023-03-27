package com.test.test.inyeccionMultiple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaCalculatorService {
	
	@Autowired
	private List<Figure> figuras;
	
	public double calcAreasFiguras() {
		double area = 0;
		for(Figure figura: figuras) {
			area += figura.calcularArea();
		}
		return area;
	}
}

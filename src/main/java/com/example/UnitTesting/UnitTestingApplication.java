package com.example.UnitTesting;

import com.example.UnitTesting.service.ProductService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class UnitTestingApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProductService productService = new ProductService();

		System.out.println("Введіть список продуктів які ви хочете взяти, наприклад, (ABCDABA):");
		String basket = scanner.nextLine();
		double totalCost = productService.calculateTotalCost(basket);
		System.out.println("Вартість кошика: " + totalCost + " $");
	}

}

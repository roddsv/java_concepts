package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		Function<Product, String> func = p -> p.getName().toUpperCase();

		/*
		 * Usando o método da classe UpperCaseName: List<String> names =
		 * list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		 * 
		 * names.forEach(System.out::println);
		 */

		/*
		 * Usando o método estático
		 * 
		 * List<String> names =
		 * list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		 * 
		 * names.forEach(System.out::println);
		 */

		/*
		 * Usando o método não estático List<String> names =
		 * list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList(
		 * ));
		 * 
		 * names.forEach(System.out::println);
		 */

		/*
		 * Usando expressão lambda declarada; List<String> names =
		 * list.stream().map(func).collect(Collectors.toList());
		 * 
		 * names.forEach(System.out::println);
		 */

		/* Usando exprresão lambda inline*/
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println);

	}

}

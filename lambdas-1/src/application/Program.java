package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0; 
		Predicate<Product> pred = p -> p.getPrice() >= min;;
		
		/* Exemplo comum de removeIf:
		 * list.removeIf(p -> p.getPrice() >= 100);
		*/
		
		/* Exemplo utilizando a classe ProductPredicate de um pacote externo:
		 * list.removeIf(new ProductPredicate());
		*/
		
		/* Exemplo utilizando um método estático: 
		 * list.removeIf(Product::staticProductPredicate);
		*/
		
		/* Exemplo utilizando um método não estático:
		 * list.removeIf(Product::nonStaticProductPredicate); 
		*/
		
		/* Exemplo com expressão lambda previamente declarada:
		 * list.removeIf(pred); 
		*/
		/* Exemplo com expressão lambda inline */
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}

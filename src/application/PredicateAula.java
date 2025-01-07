package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class PredicateAula {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd case", 80.90));
		
		/*list.removeIf(p -> p.getPrice() >= 100);*/
		
		/*list.removeIf(new ProductPredicate());*/
		
		/* list.removeIf(Product::staticProductPredicate); // Isso daqui
		// é chamado de MethodReference (refêrencia para método)
		// basta colocar o nome da classe seguido de : duas vezes e o nome do método
		// como argumento.
		isso é aceito no sistema lambda do Java  */
		
		list.removeIf(Product::nonStaticProductPredicate);
		
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}

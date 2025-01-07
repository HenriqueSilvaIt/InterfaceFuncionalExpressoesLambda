package entities;

public class Product {
	private String name;
	private Double price;
	
	// Construtores
	public Product(){
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// G
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product p ) {
		return p.getPrice() >= 100; // método estático trabalha com o produto
		// que você passar como argumento para ele 
	}
	
	public  boolean nonStaticProductPredicate() {
		return  price >= 100; // o método não estático
		// é o método da instância  diferente do estático
		// ele n precisa passar o objeto, ele trabalha direto com o objeto da classe
		// onde eu estou
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
}

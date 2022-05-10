    package com.cg.collection;
	import java.util.ArrayList;
	import java.util.Collections;
	public class SortingCollectionExx {

		public static void main(String[] args) {
			Product p1 =new Product(0112, "Teddy", 40, 10.1f);
			Product p2 =new Product(1122, "Remote", 50, 20.3f);
			Product p3 =new Product(2221, "Hat", 66, 30.3f);
			Product p4 =new Product(3232, "ball", 55, 40.5f);
			Product p5 =new Product(4343, "Bat", 44, 50.4f);
			ArrayList<Product> p=new ArrayList<Product>();
			p.add(p1);
			p.add(p2);
			p.add(p3);
			p.add(p4);
			p.add(p5);
			for(Product prod: p )
			System.out.println(p);
			Collections.sort(p);
			System.out.println("After Sorting");
			for(Product prod:p) {
				System.out.println(p);

}
		}
	}

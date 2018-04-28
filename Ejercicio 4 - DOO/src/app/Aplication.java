package app;

import models.abstract_class_heritance.CC;
import models.abstract_class_heritance.CD;
import models.inheritance.CA;
import models.inheritance.CB;

public class Aplication {

	public static void main(String[] args) 
	{
		Aplication app = new Aplication();
		app.start();
	}

	private void start() 
	{
		System.out.println("Herencia de interfaces");
		CA<Double> a = new CA<>(2.0,40.2);
		System.out.println("CA - Suma:"+a.add());
		System.out.println("CA - Multiplicar:"+a.multiply());
		System.out.println("CA - Buscar el mayor:"+a.findBiggerNumber());
		CA<Integer> b = new CB<>(1,2,3);
		System.out.println("CB - Suma:"+b.add());
		System.out.println("CB - Multiplicar:"+b.multiply());
		System.out.println("CB - Buscar el mayor:"+b.findBiggerNumber());
		System.out.println("Herencia de clases abstractas");
		CC d = new CD(1.2,1.4);
		System.out.println("CD - Suma:"+d.add());
	}

}

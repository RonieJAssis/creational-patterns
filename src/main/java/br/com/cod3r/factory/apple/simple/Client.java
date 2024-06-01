package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.oderIphone("X","standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.oderIphone("11","highEnd");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = IPhoneSimpleFactory.oderIphone("11","standard");
		System.out.println(iphone3);

	}
}

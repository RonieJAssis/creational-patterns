package br.com.cod3r.factory.apple.complex;

import br.com.cod3r.factory.apple.complex.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.complex.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.complex.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.complex.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.complex.model.IPhone;

public class Client {

	public static void main(String[] args) {

		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.oderIphone();
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.oderIphone();
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = iphone11Factory.oderIphone();
		System.out.println(iphone3);
	}
}

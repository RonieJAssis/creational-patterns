package br.com.cod3r.factory.apple.halfsimple;

import br.com.cod3r.factory.apple.halfsimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfsimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfsimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone;

public class Client {

	public static void main(String[] args) {

		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.oderIphone("standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.oderIphone("highEnd");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = gen11Factory.oderIphone("standard");
		System.out.println(iphone3);
	}
}

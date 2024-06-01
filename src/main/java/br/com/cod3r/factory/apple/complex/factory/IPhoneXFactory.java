package br.com.cod3r.factory.apple.complex.factory;

import br.com.cod3r.factory.apple.complex.model.IPhone;
import br.com.cod3r.factory.apple.complex.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    protected IPhone createIphone() {
        return new IPhoneX();
    }
}

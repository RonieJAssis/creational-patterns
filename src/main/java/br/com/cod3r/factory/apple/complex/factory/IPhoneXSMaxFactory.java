package br.com.cod3r.factory.apple.complex.factory;

import br.com.cod3r.factory.apple.complex.model.IPhone;
import br.com.cod3r.factory.apple.complex.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory{
    @Override
    protected IPhone createIphone() {
        return new IPhoneXSMax();
    }
}

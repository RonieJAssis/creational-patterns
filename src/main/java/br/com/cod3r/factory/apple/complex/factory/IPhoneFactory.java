package br.com.cod3r.factory.apple.complex.factory;

import br.com.cod3r.factory.apple.complex.model.IPhone;

public abstract class IPhoneFactory {
    public IPhone oderIphone(){
        IPhone device = null;
        device = createIphone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return  device;
    }

    protected abstract  IPhone createIphone();
}

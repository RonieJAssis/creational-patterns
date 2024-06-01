package br.com.cod3r.factory.apple.halfsimple.factory;

import br.com.cod3r.factory.apple.halfsimple.model.IPhone;

public abstract class IPhoneFactory {
    public IPhone oderIphone(String level){
        IPhone device = null;
        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return  device;
    }

    protected abstract IPhone createIphone(String level);
}

package br.com.cod3r.factory.apple.halfsimple.factory;


import br.com.cod3r.factory.apple.halfsimple.model.IPhone;
import br.com.cod3r.factory.apple.halfsimple.model.IPhoneX;
import br.com.cod3r.factory.apple.halfsimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    protected IPhone createIphone(String level) {

        if(level.equals("standard")) {
            return new IPhoneX();
        } else if(level.equals("highEnd")){
            return  new IPhoneXSMax();
        }
        return null;

    }
}

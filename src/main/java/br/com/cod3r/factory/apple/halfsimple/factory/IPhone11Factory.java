package br.com.cod3r.factory.apple.halfsimple.factory;

import br.com.cod3r.factory.apple.halfsimple.model.IPhone;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone11;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIphone(String level) {
        if(level.equals("standard")) {
            return new IPhone11();
        } else if(level.equals("highEnd")){
            return  new IPhone11Pro();
        }
        return null;
    }
}

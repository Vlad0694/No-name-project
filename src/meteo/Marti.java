package meteo;

import animals.ZileleSaptamanii;

public class Marti extends DayLength implements ZileleSaptamanii {

    public String temp(){
        return "Temperatura zilei este de 25 grade";
    }

    public String fenomenNatural(){
        return "In cursul zile de astazi va fi canicula";
    }
}

package meteo;

import animals.ZileleSaptamanii;

public class Luni extends DayLength implements ZileleSaptamanii {

    public String temp(){
        return "Temperatura zilei este de 11 grade";
    }

    public String fenomenNatural(){
        return "In cursul zilei de astazi vor fi precipatatii minime";
    }

}

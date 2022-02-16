package meteo;

import animals.ZileleSaptamanii;

public class Vineri extends DayLength implements ZileleSaptamanii {
    public String temp(){
        return "Temperatura zilei este de 0 grade";
    }

    public String fenomenNatural(){
        return "In cursul zilei de astazi va ninge ambundent";
    }

}

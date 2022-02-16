package meteo;

import animals.ZileleSaptamanii;

public class Joi extends DayLength implements ZileleSaptamanii {
    public String temp(){
        return "Temperatura zilei este de 15 grade";
    }

    public String fenomenNatural(){
        return "In cursul zilei de astazi vor fi precipatatii cu descarcari electrie";
    }
}

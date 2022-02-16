package meteo;

import animals.ZileleSaptamanii;

public class Miercuri extends DayLength implements ZileleSaptamanii {
    public String temp(){
        return "Temperatura zilei este de 20 grade";
    }

    public String fenomenNatural(){
        return "Cerul va fi inorat cu potentiale precipitatii pe alocuri";
    }
}

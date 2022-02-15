package animals;

public class Main {
    public static void main(String[] args){

        Elefant elefant = new Elefant();
        Girafa girafa = new Girafa();
        Peste peste = new Peste();
        Animal peste1 = new Peste();


        System.out.println(elefant.mananca());
        System.out.println(peste.mananca());
        System.out.println(peste1.mananca());

        System.out.println(peste1.mananca());
    }

}

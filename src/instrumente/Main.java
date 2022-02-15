package instrumente;

public class Main {
    public static void main(String[] args) {

        Chitara c = new Chitara();
        Vioara v = new Vioara();
        Fluier f = new Fluier();
        Acordeon a = new Acordeon();
        Instruments trompeta = new Instruments(){
          public String song(){
              return "tututu";
          }
        };

        //     System.out.println(c.song());
        //     System.out.println(a.song());
        //    System.out.println(v.song());
        //  System.out.println(f.song());


        Orchestra orchestra1 = new Orchestra();
        Orchestra orchestra2 = new Orchestra();
        Orchestra orchestra3 = new Orchestra();

        orchestra1.getInstrumente().add(c);
        orchestra1.getInstrumente().add(v);
        orchestra1.getInstrumente().add(f);
        orchestra1.getInstrumente().add(trompeta);

        orchestra2.getInstrumente().add(v);
        orchestra2.getInstrumente().add(v);
        orchestra2.getInstrumente().add(f);
        orchestra2.getInstrumente().add(a);

        orchestra3.getInstrumente().add(a);
        orchestra3.getInstrumente().add(c);
        orchestra3.getInstrumente().add(v);
        orchestra3.getInstrumente().add(f);
        orchestra3.getInstrumente().add(f);
        orchestra3.getInstrumente().add(c);

        for (int i = 0; i < orchestra1.getInstrumente().size(); i++) {
            System.out.println(orchestra1.getInstrumente().get(i).song());

        }

    }

}

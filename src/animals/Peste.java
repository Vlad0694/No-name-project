package animals;

public class Peste extends Animale implements Animal {
    public String mananca(){
        return super.mananca()+ " " +  "Mananca alge";
    }

    public String sunet(){
        return "glugluglglu";
    }
}
// O clasa poate extinde o clasa abstract si sa implementeze o alta clasa Interface
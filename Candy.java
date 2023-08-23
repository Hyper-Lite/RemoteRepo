import java.util.Random;
public class Candy {
    
    private String type;

    public Candy(){
        Random rng = new Random();
        String[] candyType = new String[]{"Sweet Candy", "Sour Candy", "Chewy Candy"};

        this.type = candyType[rng.nextInt(candyType.length)];


    }

    @Override
    public String toString(){

        return "This is a " + this.type;
    }
}

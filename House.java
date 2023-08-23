import java.util.Random;

public class House {

    private boolean isResponsive;
    private Candy[] candyBowl;

    //Constructor for House
    public House(){
        Random rng = new Random();
        int responsiveRate = rng.nextInt(10) + 1;

        this.candyBowl = new Candy[rng.nextInt(5) + 1];

        for (int i = 0; i < this.candyBowl.length; i++){
            this.candyBowl[i] = new Candy();

        }

        if(responsiveRate >= 5){
            this.isResponsive = true;
        }


    }

    @Override
    public String toString() {

        if (this.isResponsive) {
            return "You got " + this.candyBowl.length + "candies.";
        }
        return "You couldn't get candy from this house";
    }
}

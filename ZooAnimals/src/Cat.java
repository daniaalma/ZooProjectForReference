import java.util.Random;
public class Cat extends Feline {
    public void makeNoise() { // I think it makes sense to make each individual animal make their own noise similar to slide 17
        System.out.println("Meow Meow Meow");
    }
    public void eat() {
        System.out.println("I'm so hungry right meow!");
    }
    public void roam() { //cats do what they want!
        Random rand = new Random();
        int randomNum = rand.nextInt(((5-1)+1)+1);
        if (randomNum<=1) {
            System.out.println("Meow Meow Meow"); // make noise
        }
        else if (randomNum==2) {
            System.out.println("Going the distance"); // roam
        }
        else if (randomNum==3) {
            System.out.println("I'm so hungry right meow!"); // eat
        }
        else if (randomNum==4) {
            System.out.println(" *Yawn*....Zzzzzzzzz"); // sleep
        }
        else {
            System.out.println("Zzz...I'm waking up "); // wake up
        }
    }
}
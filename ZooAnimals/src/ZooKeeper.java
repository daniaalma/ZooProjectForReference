public class ZooKeeper {
    public static void main (String[] args) { // ok so i think here we need to add each animal, their names and call the methods
        // first lets create the animal objects from the subclasses
        Cat chloe = new Cat();
        Lion larry = new Lion();
        Wolf wendy = new Wolf();
        Dog diego = new Dog();
        // go through each of the tasks and call the method for the various objects.

        //  FIRST WE WAKE ALL THE ANIMALS UP AND THEY MAKE NOISE
        System.out.println("ZooKeeper: Time to wake up the animals in the zoo.");
        System.out.println();
        // so here we need to print the name of each animal before the response. My approach is to just print (not println since we want it all on the same line) for each animal. if you think of something better let me know!
        // we may even be able to call the methods in a println and just put the name + method? i dunno.
        System.out.print("Chloe the Cat: ");
        chloe.wakeUp();
        System.out.print("Wendy the Wolf: ");
        wendy.wakeUp();
        System.out.print("Larry the Lion: ");
        larry.wakeUp();
        System.out.print("Diego the Dog: ");
        diego.wakeUp();
        System.out.println("-------------------------------------------------------------------");
        // does the type mean subclass? not sure...

        //NOW WE CALL ROLL
        System.out.println("ZooKeeper: Lets call Roll and make sure everyone is here, when it's your turn make some noise!");
        System.out.println();
        System.out.print("Chloe the Cat: ");
        chloe.makeNoise();
        System.out.print("Wendy the Wolf: ");
        wendy.makeNoise();
        System.out.print("Larry the Lion: ");
        larry.makeNoise();
        System.out.print("Diego the Dog: ");
        diego.makeNoise();
        System.out.println("-------------------------------------------------------------------");

        //  NOW WE FEED THE ANIMALS
        System.out.println("ZooKeeper: Now that everyone is here, it's time to eat.");
        System.out.println();
        System.out.print("Chloe the Cat: ");
        chloe.eat();
        System.out.print("Wendy the Wolf: ");
        wendy.eat();
        System.out.print("Larry the Lion: ");
        larry.eat();
        System.out.print("Diego the Dog: ");
        diego.eat();
        System.out.println("-------------------------------------------------------------------");

        //  LET THE ANIMALS ROAM
        System.out.println("ZooKeeper: Everyone is full, now the animals can get some exercise.");
        System.out.println();
        System.out.print("Chloe the Cat: ");
        chloe.roam();
        System.out.print("Wendy the Wolf: ");
        wendy.roam();
        System.out.print("Larry the Lion: ");
        larry.roam();
        System.out.print("Diego the Dog: ");
        diego.roam();
        System.out.println("-------------------------------------------------------------------");

        // SLEEP TIME
        System.out.println("ZooKeeper: It is time to shut down the zoo, everyone is going to sleep.");
        System.out.println();
        System.out.print("Chloe the Cat: ");
        chloe.sleep();
        System.out.print("Wendy the Wolf: ");
        wendy.sleep();
        System.out.print("Larry the Lion: ");
        larry.sleep();
        System.out.print("Diego the Dog: ");
        diego.sleep();
        System.out.println("-------------------------------------------------------------------");
    }
}

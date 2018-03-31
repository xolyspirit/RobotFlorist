package Flowers.view;

import Flowers.controller.Florist;

public class Client {

    public void start(Florist florist){
        System.out.println("Greetings? Can i see your flowers?");
        System.out.println(florist.getFlowerList());
        System.out.println("Good, and your wrappings?");
        System.out.println(florist.getWrappingList());
        System.out.println("Can i get 1Roze?");
        System.out.println(florist.addFlowerToMyBouquet("1Roze"));
        System.out.println("Ouch, and what about Roza?");
        System.out.println(florist.addFlowerToMyBouquet("Roza"));
        System.out.println("Oh, I understand your problem. You are a robot!");
        System.out.println("Robot, give me a Rose please!");
        System.out.println(florist.addFlowerToMyBouquet("Rose"));
        System.out.println("In fine");
        System.out.println("Thanks, and give me a Violet too");
        System.out.println(florist.addFlowerToMyBouquet("Violet"));
        System.out.println("It's enough. Give me my bouquet please");
        System.out.println(florist.getMeMyBouquet());
        System.out.println("Hmm. Ok. Robot, give me Gypsophila");
        System.out.println(florist.addFlowerToMyBouquet("Gypsophila"));
        System.out.println("Now can I get my bouquet?");
        System.out.println(florist.getMeMyBouquet());
        System.out.println("Robot, you're getting on my nerves. Ok. add 1Red paper to this");
        System.out.println(florist.addWrappingToMyBouquet("1Red paper"));
        System.out.println("Maybe, rad paper?");
        System.out.println(florist.addWrappingToMyBouquet("rad paper"));
        System.out.println("Last try, I'm losing patience. Add white paper");
        System.out.println(florist.addWrappingToMyBouquet("white paper"));
        System.out.println("i don't believing this.... Give me my bouquet please");
        System.out.println(florist.getMeMyBouquet());
        System.out.println("Oh, thanks. Robot, you are too hard for me");
    }
}

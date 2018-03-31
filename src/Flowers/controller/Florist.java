package Flowers.controller;

import Flowers.model.entity.Bouquet;
import Flowers.model.entity.Flower;
import Flowers.model.FlowerStorage;
import Flowers.model.entity.Wrapping;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Florist {
    private FlowerStorage flowerStorage = new FlowerStorage();
    private Bouquet bouquet = new Bouquet();

    public String getFlowerList(){
        String answer = "";
        for (Flower f: flowerStorage.getStorage()) {
            answer+=  f.getName() + ", " ;
        }
        answer = answer.substring(0,answer.length()-2);
        return answer;
    }

    public String getWrappingList(){
        String answer = "";
        for (Wrapping w: flowerStorage.getWrappingStorage()) {
            answer+= w.getName()+ ", ";
        }
        answer = answer.substring(0,answer.length()-2);
        return answer;
    }

    public String addFlowerToMyBouquet(String flowerName){
        Pattern pattern = Pattern.compile("[A-z]");
        Matcher matcher = pattern.matcher(flowerName);
        if (!matcher.matches()){
            if (flowerStorage.containThisFlower(flowerName)) {
                if (bouquet.getLeftFlower() == null) {
                    bouquet.setLeftFlower(new Flower(flowerName));
                    return("All done");
                } else if (bouquet.getCentreFlower() == null) {
                    bouquet.setCentreFlower(new Flower(flowerName));
                    return("All done");
                } else if (bouquet.getRightFlower() == null) {
                    bouquet.setRightFlower(new Flower(flowerName));
                    return("All done");
                }
                else {
                    return("Your bouquet is full of");
                }
            }
            else {
                return("We don't have that flower");
            }
        }
        else{
            return("Wrong flower name");
        }


    }

    public String addWrappingToMyBouquet(String wrappingName){
        Pattern pattern = Pattern.compile("[A-z]");
        Matcher matcher = pattern.matcher(wrappingName);
        if (!matcher.matches()){
            if (flowerStorage.containThisWrapping(wrappingName)) {
                if (bouquet.getWrapping() == null) {
                    bouquet.setWrapping(new Wrapping(wrappingName));
                    return("All done");
                }
                else {
                    return("Your wrapping is full of");
                }
            }
            else {
                return("We don't have that wrapping");
            }
        }
        else{
            return("Wrong wrapping name");
        }
    }

    public String getMeMyBouquet(){
        if (bouquet.getLeftFlower()==null){
            return("You don't selected any flowers");
        }
        else if (bouquet.getCentreFlower()==null){
            return("You still must select two flowers");
        }
        else if (bouquet.getRightFlower()==null){
            return("You still must select one flower");
        }
        else if (bouquet.getWrapping()==null){
            return("You don't have wrapping for your bouquet");
        }

        else {
            return("Your bouquet is:" + '\n' + bouquet.getLeftFlower().getName()+ ", "
                    + bouquet.getCentreFlower().getName()
                    + " and " + bouquet.getRightFlower().getName()
                    + " wrapping into " + bouquet.getWrapping().getName());
        }
    }

}

package Flowers.model;

import Flowers.model.entity.Flower;
import Flowers.model.entity.Wrapping;

import java.util.ArrayList;


public class FlowerStorage {
    private ArrayList<Flower> storage;
    private ArrayList<Wrapping> wrappingStorage;


    public FlowerStorage() {
        storage = new ArrayList<Flower>();
        storage.add(new Flower("Violet"));
        storage.add(new Flower("Gladiolus"));
        storage.add(new Flower("Rose"));
        storage.add(new Flower("Gypsophila"));

        wrappingStorage = new ArrayList<Wrapping>();
        wrappingStorage.add(new Wrapping("red paper"));
        wrappingStorage.add(new Wrapping("white paper"));
    }

    public ArrayList<Flower> getStorage() {
        return storage;
    }

    public ArrayList<Wrapping> getWrappingStorage() {
        return wrappingStorage;
    }

    public boolean containThisFlower(String flowername){
        boolean result  = false;
        for (Flower f:storage) {
            if(f.getName().equals(flowername)){
                result  = true;
            }
        }
        return result;
    }

    public boolean containThisWrapping(String wrappingName){
        boolean result  = false;
        for (Wrapping w:wrappingStorage) {
            if(w.getName().equals(wrappingName)){
                result  = true;
            }
        }
        return result;
    }
}

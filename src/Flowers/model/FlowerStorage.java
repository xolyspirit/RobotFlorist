package Flowers.model;

import Flowers.model.entity.Flower;
import Flowers.model.entity.Wrapping;
import java.util.ArrayList;
/**Класс для хранения запаса цветов {@link Flower} и оберток {@link Wrapping}
 * @version 1.0
 * @author Xolyspirit */
public class FlowerStorage {
    /**Хранилище цветов*/
    private ArrayList<Flower> storage;
    /**Хранилище оберток*/
    private ArrayList<Wrapping> wrappingStorage;
    /**Конструктор, заполняет хранилища цветами и обертками */
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
    /**Возвращает @return storage список цветов*/
    public ArrayList<Flower> getStorage() {
        return storage;
    }
    /**Возвращает @return wrappingStorage список оберток*/
    public ArrayList<Wrapping> getWrappingStorage() {
        return wrappingStorage;
    }
    /**Принимает @param flowername и отвечает @return result
     * содержится ли такой цветок, в хранилище*/
    public boolean containThisFlower(String flowername){
        boolean result  = false;
        for (Flower f:storage) {
            if(f.getName().equals(flowername)){
                result  = true;
            }
        }
        return result;
    }
    /**Принимает @param wrappingName и отвечает @return result
     * содержится ли такая обертка, в хранилище*/
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

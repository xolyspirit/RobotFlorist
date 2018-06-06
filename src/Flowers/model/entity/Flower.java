package Flowers.model.entity;

/**Класс цветов
 * @version 1.0
 * @author Xolyspirit */
public class Flower {
    /**Название цветка*/
    private String name;
    /**Конструктор цветка, принимающий его @param name имя*/
    public Flower(String name) {
        this.name = name;
    }
    /**Стандартный геттер для имени @return name цветка*/
    public String getName() {
        return name;
    }
}



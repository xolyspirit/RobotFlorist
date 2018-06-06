package Flowers.model.entity;
/**Класс обертки
 * @version 1.0
 * @author Xolyspirit */
public class Wrapping {
    /**Название обертки*/
    private String name;
    /**Конструктор обертки, принимающий его @param name имя*/
    public Wrapping(String name) {
        this.name = name;
    }
    /**Стандартный геттер для имени @return name обертки*/
    public String getName() {
        return name;
    }
}

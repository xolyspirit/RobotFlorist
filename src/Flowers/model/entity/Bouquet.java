package Flowers.model.entity;
/**Класс для создания букета из цветов {@link Flower} и обертки {@link Wrapping}
 * @version 1.0
 * @author Xolyspirit */
public class Bouquet {
    /**Цветы используемые в букете*/
    private Flower leftFlower;
    private Flower centreFlower;
    private Flower rightFlower;
    /**Обертка*/
    private Wrapping wrapping;
    /**Стандартные геттеры и сеттеры для цветов*/
    public Flower getLeftFlower() {
        return leftFlower;
    }
    public void setLeftFlower(Flower leftFlower) {
        this.leftFlower = leftFlower;
    }
    public Flower getCentreFlower() {
        return centreFlower;
    }
    public void setCentreFlower(Flower centreFlower) {
        this.centreFlower = centreFlower;
    }
    public Flower getRightFlower() {
        return rightFlower;
    }
    public void setRightFlower(Flower rightFlower) {
        this.rightFlower = rightFlower;
    }
    /**Стандартные геттер и сеттер для обертки*/
    public Wrapping getWrapping() {
        return wrapping;
    }
    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }
}

package Flowers.model.entity;

public class Bouquet {
    private Flower leftFlower;
    private Flower centreFlower;
    private Flower rightFlower;
    private Wrapping wrapping;

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

    public Wrapping getWrapping() {
        return wrapping;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }
}

package ua.trucking.system.java;

/**
 * Присваиваем роль АВТО к МОТОЦИКЛ.
 * Наполняем значениями.
 */

public class Bicycle extends Auto {
    @Override
    public int getWTime() {
        return timeW;
    }

    @Override
    public double getWPrice() {
        return priceW;
    }

    @Override
    public double getWWeight() {
        return weightW;
    }


    @Override
    public void setWTime(int timeW) {
        this.timeW = timeW;
    }

    @Override
    public void setWPrice(double priceW) {
        this.priceW = priceW;
    }

    @Override
    public void setWWeight(double weightW) {
        this.weightW = weightW;
    }
}

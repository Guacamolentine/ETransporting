package ua.trucking.system.java;

/**
 * Абстрактный класс Auto с помощью которого будем присавивать роли машине, повозке, мотоциклу.
 * Абстракцию мы выбираем потому что весь транспорт необходимый для нашей программы обладает
 * похожими характеристиками (цена, время, массса).
 */


public abstract class Auto {

    protected int timeW;
    protected double priceW;
    protected double weightW;

    public abstract int getWTime();

    public abstract double getWPrice();

    public abstract double getWWeight();

    public abstract void setWTime(int timeW);

    public abstract void setWPrice(double priceW);

    public abstract void setWWeight(double weightW);
}

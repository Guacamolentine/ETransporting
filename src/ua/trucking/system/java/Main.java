package ua.trucking.system.java;

/**
 * В методе main мы заполняем поля:
 * "Сколько времени нужно на загрузку"
 * "Стоимость погрузки в определённый транспорт"
 * "И какой вес влезет"
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Povozka povozka = new Povozka();
        Scanner in = new Scanner(System.in);

        //Car!
        //gryzovui
        car.setWTime(23);
        car.setWPrice(15000);
        car.setWWeight(728.5);
        //\Car!

        //Bicycle!

        //gryzovui
        bicycle.setWTime(6);
        bicycle.setWPrice(850.76);
        bicycle.setWWeight(135);
        //\Bicycle!

        //Povozka!
        //gryzovui
        povozka.setWTime(3);
        povozka.setWPrice(738.65);
        povozka.setWWeight(123.85);
        //\Povozka!

        /**
         * А уже тут мы с помощью методов "println" выводим на экран характеристики которые мы ввели выше.
         * Время, цена, масса..
         * Дата прибытия..
         */

        System.out.println("Car : ");

        System.out.println("Transportation time load : " + car.getWTime() + " days");
        System.out.println("Price : " + car.getWPrice() + " UAH");
        System.out.println("Weight : " + car.getWWeight() + " kilogram");

        System.out.println();

        System.out.println("Motorcycle: ");
        System.out.println("Transportation time load: " + bicycle.getWTime() + " days");
        System.out.println("Price: " + bicycle.getWPrice() + " UAH");
        System.out.println("Weight: " + bicycle.getWWeight() + " kilogram");

        System.out.println();

        System.out.println("Povozka: ");
        System.out.println("Transportation time load: " + povozka.getWTime() + " days");
        System.out.println("Price: " + povozka.getWPrice() + " UAH");
        System.out.println("Weight: " + povozka.getWWeight() + " kilogram");

        /**
         * А здесь мы можем наблюдать как с помощью консоли мы вводим следующее:
         * Вводим дату когда мы отправляем посылку..
         * Вводим дату когда мы хотим что бы посылка прибывает..
         * Вводим месяц когда мы отправляем..
         * Вводим месяц прибыттия..
         * В итоге мы получаем калькуляцию за сколько доставят посылку
         * Конец. :D
         */

        System.out.println("Specify the day you want to send the shipment  : ");
        int daystart = in.nextInt();
        // daystart = Math.abs(daystart);
        System.out.println("Specify the desired day of arrival of the shipment  :");
        int dayend = in.nextInt();
        // dayend = Math.abs(dayend);

        System.out.println("Specify the month you want to send the shipment  :");
        int monthstart = in.nextInt();
        // monthstart = Math.abs(monthstart);
        System.out.println("Specify the month you want to arrival the shipment  :");
        int monthend = in.nextInt();
        //monthstart = Math.abs(monthstart);
        System.out.println("The shipment will be on its way : "
                +(dayend - daystart)+" days "+(monthend - monthstart)+" month");
    }
}

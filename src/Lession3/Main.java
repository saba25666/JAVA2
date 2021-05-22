package Lession3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String[] arr = {"asd", "ds", "ret", "123"};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("Task 3");
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        for (int j = 0; j < 3; j++) {
            orangeBox1.add(new Orange());
        }

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        float orange1Weigth = orangeBox1.getWeight();
        float orange2Weigth = orangeBox2.getWeight();
        float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array) {
        T temp = array[2];
        array[2] = array[3];
        array[3] = temp;
    }

}
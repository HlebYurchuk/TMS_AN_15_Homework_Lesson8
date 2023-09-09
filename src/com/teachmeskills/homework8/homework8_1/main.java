package com.teachmeskills.homework8.homework8_1;

public class main  {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(2),
                new Circle(5),
                new Rectangle(2,5),
                new Tringle(7, 9, 5),
                new Rectangle(1, 6),
                new Tringle(8, 5, 5)};
        double sum=0;
        for (Figure figure : figures){
            double square = figure.square();
            sum += figure.perimeter();
            System.out.println(square + " - Площадь");
        }
        System.out.println(sum + " - Сумма периметров");

    }
}

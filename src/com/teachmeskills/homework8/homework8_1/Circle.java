package com.teachmeskills.homework8.homework8_1;

final class Circle extends Figure{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    @Override
    double square() {
return Math.PI * radius *radius;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }

}

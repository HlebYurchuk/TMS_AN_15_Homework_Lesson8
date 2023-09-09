package com.teachmeskills.homework8.homework8_1;

sealed abstract class Figure permits Circle, Rectangle, Tringle {
    abstract double square();
    abstract double perimeter();
}

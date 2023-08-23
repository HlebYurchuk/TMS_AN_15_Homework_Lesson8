package homework8_1;

public class Rectangle extends Figure{

    private int side1;
    private int side2;

    public Rectangle(int side1,int side2){
        this.side1=side1;
        this.side2=side2;
    }
    @Override
    double square() {
        return side1*side2;
    }

    @Override
    double perimeter() {
        return (side1+side2)*2;
    }
}

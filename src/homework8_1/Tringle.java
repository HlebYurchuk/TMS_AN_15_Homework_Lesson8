package homework8_1;

public class Tringle extends Figure {
    private int side1;
    private int side2;
    private int side3;

    public Tringle(int side1,int side2,int side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    double square() {

    double p = (side1+side2+side3)/2;
        return Math. sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    double perimeter() {

        return side1+side2+side3;
    }

}

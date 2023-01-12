package shapes;

public class Square extends Quadrilateral {


    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2* (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setLength(double length) {

    }
//
//
//    public double getPerimeter(){
//        double side = this.length;
//        return  side * 4;
//    }
//    public double getArea(){
//        double side = this.length;
//        return (int) Math.pow(side,2);
//    }






}

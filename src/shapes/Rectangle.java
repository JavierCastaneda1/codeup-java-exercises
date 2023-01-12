package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }


//    //First make protected properties for both length and width.
//    protected double length;
//    protected double width;
//
////The following constructs and accepts two numbers for length and width.
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//
//    //The following are two methods of the rectangle class. (area and perimeter)
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    public double getArea(){
//        return this.length * this.width;
//    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }



}

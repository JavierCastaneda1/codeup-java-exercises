package shapes;

public class Square extends Quadrilateral {




        public Square(double side){
        super(side,side);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public void setLength(int length) {

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

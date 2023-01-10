package shapes;

public class Rectangle {
    //First make protected properties for both length and width.
    protected int length;
    protected int width;

//The following constructs and accepts two numbers for length and width.
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }


    //The following are two methods of the rectangle class. (area and perimeter)
    public int getPerimeter(){
        return 2 * (this.length + this.width);
    }

    public int getArea(){
        return this.length + this.width;
    }


}

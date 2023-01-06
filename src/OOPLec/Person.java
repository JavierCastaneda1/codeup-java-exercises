package OOPLec;

public class Person {
    public static String breathes = "Oxygen";
    private String name;
    private static String height;

    public Person(){}

    public Person(String name, String height){
        this.name = name;
        this.height = height;
    }

    public Person(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("{%n name: %s,%n height: %s%n};", this.name, this.height);
    }

    public String getName(){
        return name;
    }

    public String getHeight(){
        return height;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void setHeight(String height) {
        Person.height = height;
    }

    public static void main(String[] args){
        Person tony = new Person("Tony");
        System.out.println(tony.name);
    }
}

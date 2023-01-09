
public class Person {

    public static void main(String[] args){

        Person javier = new Person("Javier");

        javier.sayHello();
        javier.setName("Javier Castaneda");
        System.out.println(javier.getName());
    }


    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, from  %s.%n", name);
    }





}

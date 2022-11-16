package FirstPackage;

class  Animal
{
    double height;
    double weight;
    String name;
    Animal(double height, double weight, String name)
    {
        this.height = height;
        this.weight = weight;
        this.name = name;
        System.out.println("Constructor of Animal Class");
    }
    void eat()
    {
        System.out.println("Animal is eating food");
    }
    void sleep()
    {
        System.out.println("Animal is sleeping ");
    }
    void getAnimal()
    {
        System.out.println("Information of the animal is ");
        System.out.println("Name : "+name);
        System.out.println("Height : "+height);
        System.out.println("Weight : "+weight);
    }
}

class Canine extends Animal
{
    Canine(double height, double weight, String name)
    {
        super(height, weight, name);
        System.out.println("Constructor of Canine Class");
    }
    void eat()
    {
        System.out.println("Canine is eating ");
    }
}
public class MultipleInheritance extends Canine
{
    MultipleInheritance(double height, double weight, String name) {
        super(height, weight, name);
        System.out.println("Constructor of MultipleInheritance Class");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance(25.7, 45, "Dog");
        obj.eat();
        obj.sleep();
        obj.getAnimal();
    }
}

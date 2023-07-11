package Package1;
class Animal{
    public void makeSound(){
        System.out.println("The sound made by the animal");
    }
}
class Dog extends Animal{
    public void dogSound(){
        System.out.println("Dogs bark");
    }
}
class Cat extends Animal{
    public void catSound(){
        System.out.println("Cats meow");
    }
}
class Cow extends Animal{
    public void cowSound(){
        System.out.println("Cows moo");
    }
}

public class Inheritance {
    public static void main(String[] args){
        Dog d=new Dog();
        Cat c=new Cat();
        Cow co=new Cow();
        
        d.dogSound();
        c.catSound();
        co.cowSound();
    }
}

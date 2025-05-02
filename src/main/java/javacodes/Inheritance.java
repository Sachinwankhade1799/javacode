package javacodes;

public class Inheritance {

	public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Inherited method
        myDog.bark();      // Own method
    }
}


class Animal {
    
	String color= "White";
	int age = 12;
	
	void makeSound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    
	String gender = "male";
	
	void bark() {
        System.out.println("Dog barks");
    }


    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Inherited method
        myDog.bark();      // Own method
    }
}

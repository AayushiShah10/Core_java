package project1;
//Superclass
class Animal {
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Cat meows");
 }
}

public class AnimalSoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a; // Reference of type Animal

        a = new Dog(); // Dog object
        a.makeSound(); // Output: Dog barks

        a = new Cat(); // Cat object
        a.makeSound(); // Output: Cat meows

	}

}

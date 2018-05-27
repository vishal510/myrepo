
public class Dog extends Animal {
	public void callme() {
		System.out.println("In callme of Dog");
	}

	public void callme2() {
		System.out.println("In callme2 of Dog");
	}
	public static void main (String [] args) 
    {
		Animal animal = new Dog();
		Dog castedDog = (Dog) animal;
		animal.callme();
		castedDog.callme();
        ((Dog) castedDog).callme2();
        ((Dog) castedDog).callme();
		
        /*Animal animal = new Animal();
		Dog notADog = (Dog) animal;
		animal.callme();
		notADog.callme();
        ((Dog) notADog).callme2();
        ((Dog) notADog).callme();*///ClassCastException: Animal cannot be cast to Dog
    }

	
}

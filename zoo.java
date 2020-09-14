import java.util.Scanner;  // Import the Scanner class
	
	//base class
	class Animal {
		//defualt animal traits
		Boolean awake = false;
		String name = "Bob";
		public Animal(){
			awake = true;
		}
		void sleep(){
		   awake = false;
		}
	}
	//subclasses of Animal
	class Feline extends Animal {
		void roam(){
		}
        }
	class Pachyderm extends Animal {
		void roam(){
		}
        }
	class Canine extends Animal {
		void roam(){
		}
        }
	//Custom sub-class per instructions
	class Reptile extends Animal {
		void roam(){
		}
        }
	//subclasses of Feline
    class Tiger extends Feline {
		public Tiger(){
			awake = true;
		}
		void makeNoise(){
		}
	}
	class Cat extends Feline {
		public Cat(){
			awake = true;
		}
		void makeNoise(){
		}
	}
	class Lion extends Feline {
		public Lion(){
			awake = true;
		}
		void makeNoise(){
		}
	}
	//subclasses of CANINE
    class Dog extends Canine {
		public Dog(){
			awake = true;
		}
		void makeNoise(){
		}
	}
	class Wolf extends Canine {
		public Wolf(){
			awake = true;
		}
		void makeNoise(){
		}
	}
	//subclasses of Pachyderm
    class Hippo extends Pachyderm {
		public Hippo(){
			awake = true;
		}
		void makeNoise(){
		}
	}
	class Rhino extends Pachyderm {
		public Rhino(){
			awake = true;
		}
		void makeNoise(){
		}
	}
	class Elephant extends Pachyderm {
		public Elephant(){
			awake = true;
		}
		void makeNoise(){
		}
	}
	//Zoo-employee abtract class
	abstract class ZooEmployee {
		abstract void clean();
	}
	//ZooKeeper class
	class zooKeeper{
		public zooKeeper(){
		}
		void wake(Animal tmpAnimal){
			System.out.println("Zoo Keeper Feeds " + tmpAnimal.name); 
		}
		void rollCall(Animal tmpAnimal){
			System.out.println("Zoo Keeper Counted " + tmpAnimal.name + "as present");
		}
		void feed(Animal tmpAnimal){
			System.out.println("Zoo Keeper fed " + tmpAnimal.name);
		}
		void excersize(Animal tmpAnimal){
			System.out.println("Zoo Keeper excersized " + tmpAnimal.name);
		}
		void putToSleep(Animal tmpAnimal){
			System.out.println("Zoo Keeper put " + tmpAnimal.name + "to sleep for the night.");
		}
	}
	public class zoo{
		public static void main(String[] args) {
		//Ask how many days
		Scanner myObj = new Scanner(System.in);  
		System.out.println("Enter number of days");
		String daysString = myObj.nextLine();  
		System.out.println("Thanks");  
		int days = Integer.parseInt(daysString);

		//array to store different animals in the zoo
		Animal zooAnimals[]= new Animal[1];
        zooAnimals[0] = new Tiger();
		zooAnimals[0].sleep();
		//declare zooKeeper Object
		zooKeeper dan = new zooKeeper();
		//loop to wake all animals
		for(int i=0; i<zooAnimals.length; i++) {
         dan.wake(zooAnimals[i]);
      }
    }
	}


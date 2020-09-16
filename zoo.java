import java.util.Scanner;  // Import the Scanner class
	
	//base class
	class Animal {
		//defualt animal traits
		Boolean awake = false;
		String name = "Bob";
		public Animal(){
			awake = true;
		}
		//base class methods
		void sleep(){
		   awake = false;
		   System.out.println(this.name + " has gone to bed.");
		}
		void wake(){
		   awake = true;
		   System.out.println(this.name + " has awaken!!");
		}
		void makeNoise(){
		   System.out.println(this.name + "says Haerggg!");
		}
		void excersize(){
			System.out.println(this.name + " has worked out!");
		}
		void eat(){
			System.out.println(this.name + " has eaten!");
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
	//custom sub-classes of reptile
	class Lizard extends Reptile {
	}
	class Snake extends Reptile {
	}
	//subclasses of Feline
    class Tiger extends Feline {
		public Tiger(){
			awake = true;
		}
		void makeNoise(){
			 System.out.println(this.name + "says ROARRR!");
		}
	}
	class Cat extends Feline {
		public Cat(){
			awake = true;
		}
		void makeNoise(){
			 System.out.println(this.name + "says meow!");
		}
	}
	class Lion extends Feline {
		public Lion(){
			awake = true;
		}
		void makeNoise(){
			System.out.println(this.name + "says ROARRRRRRRRRRR!");
		}
	}
	//subclasses of CANINE
    class Dog extends Canine {
		public Dog(){
			awake = true;
		}
		void makeNoise(){
			System.out.println(this.name + "says Bark!");
		}
	}
	class Wolf extends Canine {
		public Wolf(){
			awake = true;
		}
		void makeNoise(){
			System.out.println(this.name + "says HOWLLLL!");
		}
	}
	//subclasses of Pachyderm
    class Hippo extends Pachyderm {
		public Hippo(){
			awake = true;
		}
		void makeNoise(){
			System.out.println(this.name + "says kaflump!");
		}
	}
	class Rhino extends Pachyderm {
		public Rhino(){
			awake = true;
		}
		void makeNoise(){
			System.out.println(this.name + "Merrr!");
		}
	}
	class Elephant extends Pachyderm {
		public Elephant(){
			awake = true;
		}
		void makeNoise(){
			System.out.println(this.name + "Ooooooooo!");
		}
	}
	//Zoo-employee abtract class
	abstract class ZooEmployee {
		String name = "Dan";
		void clean(){
			System.out.println(this.name + " has cleaned for the day!");
		}
	}
	//ZooKeeper class
	class zooKeeper extends ZooEmployee{
		public zooKeeper(){
		}
		void wake(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.name+ " attempted to wake " + tmpAnimal.name); 
			tmpAnimal.wake();
		}
		void rollCall(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.name+ " attempted to count " + tmpAnimal.name + "as present");
			tmpAnimal.makeNoise();
		}
		void feed(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.name+ " attempted to feed " + tmpAnimal.name);
			tmpAnimal.eat();
		}
		void excersize(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.name+ " attempted to excersize " + tmpAnimal.name);
			tmpAnimal.excersize();
		}
		void putToSleep(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.name+ " attempted to put " + tmpAnimal.name + "to sleep for the night.");
			tmpAnimal.sleep();
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
		//loop for each day
		for(int i=0; i<days; i++) {
			//loop to wake all animals
			for(int j=0; j<zooAnimals.length; j++) {
				dan.wake(zooAnimals[j]);
			}
			//loop to rolCall all animals
			for(int j=0; j<zooAnimals.length; j++) {
				dan.rollCall(zooAnimals[j]);
			}
			//loop to feed all animals
			for(int j=0; j<zooAnimals.length; j++) {
				dan.feed(zooAnimals[j]);
			}
			//loop to excersize all animals
			for(int j=0; j<zooAnimals.length; j++) {
				dan.excersize(zooAnimals[j]);
			}
			//loop to excersize all animals
			for(int j=0; j<zooAnimals.length; j++) {
				dan.putToSleep(zooAnimals[j]);
			}
		}
    }
	}

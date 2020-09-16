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
		public Lizard(String newname){
			awake = true;
			name = newname;
		}
	}
	class Snake extends Reptile {
		public Snake(String newname){
			awake = true;
			name = newname;
		}
	}
	//subclasses of Feline
    class Tiger extends Feline {
		public Tiger(String newname){
			awake = true;
			name = newname;
		}
		void makeNoise(){
			 System.out.println(this.name + "says ROARRR!");
		}
	}
	class Cat extends Feline {
		public Cat(String newname){
			awake = true;
			name = newname;
		}
		void makeNoise(){
			 System.out.println(this.name + "says meow!");
		}
	}
	class Lion extends Feline {
		public Lion(String newname){
			awake = true;
			name = newname;
		}
		void makeNoise(){
			System.out.println(this.name + "says ROARRRRRRRRRRR!");
		}
	}
	//subclasses of CANINE
    class Dog extends Canine {
		public Dog(String newname){
			awake = true;
			name = newname;
		}
		void makeNoise(){
			System.out.println(this.name + "says Bark!");
		}
	}
	class Wolf extends Canine {
		public Wolf(String newname){
			awake = true;
			name = newname;
		}
		void makeNoise(){
			System.out.println(this.name + "says HOWLLLL!");
		}
	}
	//subclasses of Pachyderm
    class Hippo extends Pachyderm {
		public Hippo(String newname){
			awake = true;
			name = newname;
		}
		void makeNoise(){
			System.out.println(this.name + "says kaflump!");
		}
	}
	class Rhino extends Pachyderm {
		public Rhino(String newname){
			awake = true;
			name = newname;
		}
		void makeNoise(){
			System.out.println(this.name + "Merrr!");
		}
	}
	class Elephant extends Pachyderm {
		public Elephant(String newname){
			awake = true;
			name = newname;
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
			System.out.println("Zoo Keeper " + this.name+ " attempted to count " + tmpAnimal.name + " as present");
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
			System.out.println("Zoo Keeper " + this.name+ " attempted to put " + tmpAnimal.name + " to sleep for the night.");
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
		Animal zooAnimals[]= new Animal[20];
		//Populate array with animal objects
        zooAnimals[0] = new Tiger("Tony");
		zooAnimals[1] = new Tiger("Timmy");
		zooAnimals[2] = new Lizard("Larry");
		zooAnimals[3] = new Lizard("Lorenne");
		zooAnimals[4] = new Snake("Sam");
		zooAnimals[5] = new Snake("Sarah");
		zooAnimals[6] = new Cat("Carrie");
		zooAnimals[7] = new Cat("Chris");
		zooAnimals[8] = new Lion("Lemons");
		zooAnimals[9] = new Lion("Laurel");
		zooAnimals[10] = new Dog("Daniel");
		zooAnimals[11] = new Dog("Darren");
		zooAnimals[12] = new Wolf("Warren");
		zooAnimals[13] = new Wolf("Will");
		zooAnimals[14] = new Hippo("Harry");
		zooAnimals[15] = new Hippo("Hamlet");
		zooAnimals[16] = new Rhino("Ryan");
		zooAnimals[17] = new Rhino("Rosalina");
		zooAnimals[18] = new Elephant("Ellie");
		zooAnimals[19] = new Elephant("Elizabeth");

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


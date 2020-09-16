import java.util.Random; //for probability
//base class
	public class Animal {
		Random rand = new Random(); //random class instance
		//defualt animal traits
		Boolean awake = false;
		//Name is the IDENTITY for each animal, so we can differntiate sub-type
		String name = "Bob";
		String type = "Animal";
		public Animal(){
			awake = true;
		}
		//base class methods
		void sleep(){
		   awake = false;
		   System.out.println(this.name + " the " + this.type + " has gone to bed.");
		}
		void wake(){
		   awake = true;
		   System.out.println(this.name + " the " + this.type + " has awaken!!");
		}
		void makeNoise(){
		   System.out.println(this.name + " the " + this.type + " says Haerggg!");
		}
		void excersize(){
			System.out.println(this.name + " the " + this.type + " has worked out!");
		}
		void eat(){
			System.out.println(this.name + " the " + this.type + " has eaten!");
		}
	}
	//subclasses of Animal
	class Feline extends Animal {
		//override defualt sleep method
		void sleep(){
			//random between 0-99
			int int_random = rand.nextInt(99); 
			//30 percent chance
			if(int_random < 30){
				System.out.println(this.name + " the " + this.type + " roamed instead of sleeping.");
			}
			//another 30 percent chance
			else if(int_random >= 30 && int_random <60){
				System.out.println(this.name + " the " + this.type + " made a squak instead of sleeping.");
			}
			//40 percent chance
			else{
				System.out.println(this.name + " the " + this.type + " selpt per usual.");
			}
		}
        }
	class Pachyderm extends Animal {
		void excersize(){
			//random between 0-99
			int int_random = rand.nextInt(99); 
			//25 percent chance
			if(int_random < 25){
				System.out.println(this.name + " the " + this.type + " CHARGHED instead of sleeping!!");
			}
			else{
				System.out.println(this.name + " the " + this.type + " has excersized per usual.");
			}
		}
        }
	class Canine extends Animal {
		void roam(){
			System.out.println(this.name + " the " + this.type + " has roamed");
		}
        }
	//Custom sub-class per instructions
	class Reptile extends Animal {
		void roam(){
			System.out.println(this.name + " the " + this.type + " has roamed");
		}
        }
	//custom sub-classes of reptile
	class Lizard extends Reptile {
		public Lizard(String newname){
			awake = true;
			name = newname;
			type = "Lizard";
		}
	}
	class Snake extends Reptile {
		public Snake(String newname){
			awake = true;
			name = newname;
			type = "Snake";
		}
	}
	//subclasses of Feline
    class Tiger extends Feline {
		public Tiger(String newname){
			awake = true;
			name = newname;
			type = "Tiger";
		}
		void makeNoise(){
			 System.out.println(this.name + " the " + this.type + " says ROARRR!");
		}
		//override base-class eat method
		void eat(){
			System.out.println(this.name + " the " + this.type + " devoured its dinner!");
		}
	}
	class Cat extends Feline {
		public Cat(String newname){
			awake = true;
			name = newname;
			type = "Cat";
		}
		void makeNoise(){
			 System.out.println(this.name + " the " + this.type + " says meow!");
		}
		//override base-class eat method
		void eat(){
			System.out.println(this.name + " the " + this.type + " slowly ate from a can.");
		}
	}
	class Lion extends Feline {
		public Lion(String newname){
			awake = true;
			name = newname;
			type = "Lion";
		}
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + " says ROARRRRRRRRRRR!");
		}
	}
	//subclasses of CANINE
    class Dog extends Canine {
		public Dog(String newname){
			awake = true;
			name = newname;
			type = "Dog";
		}
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + " says Bark!");
		}
		//override base excersize method
		void excersize(){
			//get random from 0-99
			int int_random = rand.nextInt(99); 
			//25 percent chance
		    if(int_random < 25){
				System.out.println(this.name + " the " + this.type + " dug up dirt instead of exercising");
			}
			else{
				System.out.println(this.name + " the " + this.type + " excersized by roaming per usual");
			}
		}
	}
	class Wolf extends Canine {
		public Wolf(String newname){
			awake = true;
			name = newname;
			type = "Wolf";
		}
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + " says HOWLLLL!");
		}
		//override base-class eat method
		void eat(){
			System.out.println(this.name + " the " + this.type + " tore its dinner to shreds!");
		}
	}
	//subclasses of Pachyderm
    class Hippo extends Pachyderm {
		public Hippo(String newname){
			awake = true;
			name = newname;
			type = "Hippo";
		}
		
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + " says kaflump!");
		}
	}
	class Rhino extends Pachyderm {
		public Rhino(String newname){
			awake = true;
			name = newname;
			type = "Rhino";
		}
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + " says Merrr!");
		}
		//override base-class eat method
		void eat(){
			System.out.println(this.name + " the " + this.type + " ate some Mcdonalds some the in the exibit!");
		}
	}
	class Elephant extends Pachyderm {
		public Elephant(String newname){
			awake = true;
			name = newname;
			type = "Elephant";
		}
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + "says Ooooooooo!");
		}
	}

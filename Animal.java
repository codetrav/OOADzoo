//base class
	public class Animal {
		//defualt animal traits
		Boolean awake = false;
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
		   System.out.println(this.name + " the " + this.type + "says Haerggg!");
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
		//TODO: Override some functions from animal
		void roam(){
		}
        }
		//TODO: Write in special cases mentioned near bottom of page 1 of assignment
	class Pachyderm extends Animal {
		void roam(){
		}
        }
		//TODO: Write in special cases mentioned near bottom of page 1 of assignment
	class Canine extends Animal {
		//TODO: Override some functions from animal
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
			 System.out.println(this.name + " the " + this.type + "says ROARRR!");
		}
		//override base-class eat method
		void eat(){
			System.out.println(this.name + " the " + this.type + "devoured its dinner!");
		}
	}
	class Cat extends Feline {
		public Cat(String newname){
			awake = true;
			name = newname;
			type = "Cat";
		}
		void makeNoise(){
			 System.out.println(this.name + " the " + this.type + "says meow!");
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
			System.out.println(this.name + " the " + this.type + "says ROARRRRRRRRRRR!");
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
			System.out.println(this.name + " the " + this.type + "says Bark!");
		}
		//TODO: Write in special cases mentioned near bottom of page 1 of assignment
	}
	class Wolf extends Canine {
		public Wolf(String newname){
			awake = true;
			name = newname;
			type = "Wolf";
		}
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + "says HOWLLLL!");
		}
		//override base-class eat method
		void eat(){
			System.out.println(this.name + " the " + this.type + "tore its dinner to shreds!");
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
			System.out.println(this.name + " the " + this.type + "says kaflump!");
		}
	}
	class Rhino extends Pachyderm {
		public Rhino(String newname){
			awake = true;
			name = newname;
			type = "Rhino";
		}
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + "Merrr!");
		}
		//override base-class eat method
		void eat(){
			System.out.println(this.name + " the " + this.type + "ate some Mcdonalds some the in the exibit!");
		}
	}
	class Elephant extends Pachyderm {
		public Elephant(String newname){
			awake = true;
			name = newname;
			type = "Elephant";
		}
		void makeNoise(){
			System.out.println(this.name + " the " + this.type + "Ooooooooo!");
		}
	}

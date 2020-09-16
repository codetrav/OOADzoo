//base class
	public class Animal {
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
		//TODO: Write in special cases mentioned near bottom of page 1 of assignment
	class Pachyderm extends Animal {
		void roam(){
		}
        }
		//TODO: Write in special cases mentioned near bottom of page 1 of assignment
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
		//override base-class eat method
		void eat(){
			System.out.println(this.name + "devoured its dinner!");
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
		//override base-class eat method
		void eat(){
			System.out.println(this.name + " slowly ate from a can.");
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
		//TODO: Write in special cases mentioned near bottom of page 1 of assignment
	}
	class Wolf extends Canine {
		public Wolf(String newname){
			awake = true;
			name = newname;
		}
		void makeNoise(){
			System.out.println(this.name + "says HOWLLLL!");
		}
		//override base-class eat method
		void eat(){
			System.out.println(this.name + "tore its dinner to shreds!");
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
		//override base-class eat method
		void eat(){
			System.out.println(this.name + "ate some Mcdonalds some the in the exibit!");
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

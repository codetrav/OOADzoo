
	
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
	//Zoo-keeper abtract class
	abstract class GraphicObject {
   abstract void feed();
}
	
	public class zoo{
		public static void main(String[] args) {
		//array to store different animals in the zoo
		Animal zooAnimals[]= new Animal[5];
        zooAnimals[0] = new Tiger();
		zooAnimals[0].sleep();
    }
	}

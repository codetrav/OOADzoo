	class Animal {
		Boolean awake = false;
		public Animal(){
			awake = true;
		}
		void sleep(){
		   awake = false;
		}
	}
	class Feline extends Animal {
		void roam(){
		}
        }
    class Tiger extends Feline {
		public Tiger(){
			awake = true;
		}
		void makeNoise(){
		}
	}
    
	public class zoo{
		public static void main(String[] args) {
        Tiger jeff = new Tiger();
		jeff.sleep();
    }
	}

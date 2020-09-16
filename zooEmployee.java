//Zoo-employee abtract class
	public abstract class zooEmployee {
		String name = "Dan";
		void clean(){
			System.out.println(this.name + " has cleaned for the day!");
		}
	}
	//ZooKeeper class
	class zooKeeper extends zooEmployee{
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

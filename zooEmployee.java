//Zoo-employee abtract class
	public abstract class zooEmployee {
		//encapsulated field
		private String name = "Dan";
		//abstract method with no impl
	    abstract void clean();
		//accessor to get encapsulated name
		String getName(){
			return name;
		}
	}
	//ZooKeeper class
	class zooKeeper extends zooEmployee{
		public zooKeeper(){
		}
		void wake(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.getName() + " attempted to wake " + tmpAnimal.name); 
			tmpAnimal.wake();
		}
		void rollCall(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.getName() + " attempted to count " + tmpAnimal.name + " as present");
			tmpAnimal.makeNoise();
		}
		void feed(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.getName() + " attempted to feed " + tmpAnimal.name);
			tmpAnimal.eat();
		}
		void excersize(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.getName() + " attempted to excersize " + tmpAnimal.name);
			tmpAnimal.excersize();
		}
		void putToSleep(Animal tmpAnimal){
			System.out.println("Zoo Keeper " + this.getName() + " attempted to put " + tmpAnimal.name + " to sleep for the night.");
			tmpAnimal.sleep();
		}
		//implimentation for abtract method clean
		void clean(){
			System.out.println(this.getName()  + " cleaned out the animals pens!");
		}
	}

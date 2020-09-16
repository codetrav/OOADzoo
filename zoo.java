import java.util.Scanner;  // Import the Scanner class
	
	
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


import java.util.Scanner;

class Main
{
	public static void Main{String[] args}
	{
		Scanner scan = new Scanner(System.in);
		Kart kart1 = new Kart();
		Kart kart2 = new Kart("LUIGI", 15.0, 110);
		
		System.out.println("Enter the details of the third kart (character name, distance (decimal), heading in degrees)");
		String name = scan.nextLine();
		name = name.toUpperCase();
		double distance = scan.nextDouble();
		int heading = scan.nextInt();
		Kart kart3 = new Kart(name, distance, heading);
		
		System.out.println("Initial Positions:");
		System.out.println("Kart 1: " + kart1);
		System.out.println("Kart 2: " + kart2);
		System.out.println("Kart 3: " + kart3 + "\n");
		
		System.out.println("Initial Distances:");
		System.out.println("The distance between Kart 1 and Kart 2 is " + kart1.distTo(kart2) + " metres.");
		System.out.println("The distance between Kart 1 and Kart 3 is " + kart1.distTo(kart3) + " metres.");
		System.out.println("The distance between Kart 2 and Kart 3 is " + kart2.distTo(kart3) + " metres.");
		
		kart1.move(kart2.distTo(kart3), 85);
		kart2.move(9.0, 125);
		kart3.move(5.5, 65);
		
		System.out.println("New Distances:");
		System.out.println("The distance between Kart 1 and Kart 2 is " + kart1.distTo(kart2) + " metres.");
		System.out.println("The distance between Kart 1 and Kart 3 is " + kart1.distTo(kart3) + " metres.");
		System.out.println("The distance between Kart 2 and Kart 3 is " + kart2.distTo(kart3) + " metres.");

	}
}

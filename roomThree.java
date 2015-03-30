import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;

public class roomThree implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(4);
	
	public roomThree(){
		name = "Room Three";
		options.add("a");
		options.add("b");
		options.add("c");
		options.add("d");
	}
	public void narration(BufferedReader in)throws InterruptedException{
		Thread.sleep(1500);
		System.out.println("You are in " + name);
		Thread.sleep(1000);
		System.out.println("There are many dead plants in this room. " +
		"On the dresser is a fishtank. There is a note a diary on the dresser.");
		System.out.println("Options:");
		System.out.println("a: feed the fish");
		System.out.println("b: read the note on the dresser");
		System.out.println("c: read the diary");
		System.out.println("d: leave the room");
		String response = input.nextLine();
		while(!response.equals("d")){
			if(response.equals("a")){
				System.out.println("You feed the fish.");
			}
			if(response.equals("b")){
				System.out.println("The note reads: ");
				Thread.sleep(1000);
				System.out.println("");
				Thread.sleep(1000);
				System.out.println("Raeumungsbefehl");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Ms. Kattenhorn");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Sehr zu unser Bedaueren, wir mussen Sie informieren, " +
				"dass Sie gegen eine Auflage unserer Gemeinschaft verstossen haben, und deshalb " +
				"haben Sie eine Woche, sich zu entfernen, oder einer Vertreter ankommen wird, sich zum " +
				"Abschluss bringen. ");
				Thread.sleep(4000);
				System.out.println("");
				Thread.sleep(1000);
				System.out.println("Unter diesen Umstaenden ist Ihrer Verstag gestrichen.");
				System.out.println("");
				Thread.sleep(2000);
				System.out.println("Ihre Beharren, auf dieser Tiere sich um zu kuemmern, " +
				"verschwendet Ressourcen und schadet unsere Gemeinschaft.");
				System.out.println("");
				Thread.sleep(2000);
				System.out.println("Ihre Mitverantwortlichkeit in unsere Gemeinschaft hat sich nicht " +
				"bewaehren, und deshalb mussen wir auf seiner Abfahrt bestehen.");
				System.out.println("");
				Thread.sleep(1000);
				System.out.println("Mit freundlichen Gruessen,");
				Thread.sleep(1000);
				System.out.println("Der Gemeinderat");
				setName("Kattenhorn's Room");
			}
			if(response.equals("c")){
				System.out.println("The diary is empty except for one page");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Ich bin heute sehr muede.");
			}
			Thread.sleep(1000);
			System.out.println("Options:");
			System.out.println("a: feed the fish");
			System.out.println("b: read the note on the dresser");
			System.out.println("c: read the diary");
			System.out.println("d: leave the room");
			response = input.nextLine();
		}
		System.out.println("You leave the room");
		return;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
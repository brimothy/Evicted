import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class roomFive implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(4);
	
	public roomFive(){
		name = "Room Five";
		options.add("a");
		options.add("b");
		options.add("c");
		options.add("d");
	}
	public void narration(BufferedReader in)throws InterruptedException{
		System.out.println("This room is very small and neat. There are curtains over the window and coverings on the chairs. " + 
		"There's a piece of paper and some framed pictures on the desk. There's also a smaller piece of paper in the middle of the bed.");
		Thread.sleep(1500);
		System.out.println("You are in " + name);
		Thread.sleep(1000);
		System.out.println("Options:");
		System.out.println("a: look at the paper on the desk");
		System.out.println("b: look at the small note on the bed");
		System.out.println("c: look at the framed pictures");
		System.out.println("d: leave the room");
	
	String response = input.nextLine();
		while(!response.equals("d")){
			if(!options.contains(response)){
				try{in.read();}
				catch(IOException e){
					System.out.println("Exception: " + e.getMessage());
					return;
				}
			}
			else if(response.equals("a")){
				System.out.println("It reads:");
				Thread.sleep(1000);
				System.out.println("Eviction Notice");
				Thread.sleep(1000);
				System.out.println("Mr. Akers, ");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("We regret to inform you that you have violated " +
				"the terms of your residence here and thus have exactly one week " +
				"to remove yourself from the premises or an agent will arrive to carry out " +
				"your termination.");
				Thread.sleep(4000);
				System.out.println("");
				System.out.println("The circumstances of your breach of contract are such: ");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Your failing physical health is putting strain on the productivity of our community. " +
				"You are no longer capable of fulfilling the values of the community detailed to you at the start of your residency.");
				Thread.sleep(2000);
				System.out.println("");
				System.out.println("Your participation in this community has been, overall, a failure " +
				"and thus we must insist upon your departure.");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Yours,");
				System.out.println("The council.");
				setName("Akers' Room");
			}
			
			else if(response.equals("b")){
				System.out.println("It reads:");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("My dear friends and neighbors,");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("It saddens me greatly to tell you this, but the council has informed me that I can no longer live here. " + 
				"I don't know where I'm going to go, or what I'm going to do, but I don't want to continue to be a burden on this community. " + 
				"Wherever I find myself, though, I'll remember you all fondly and I'll miss you all very much.");
				System.out.println("");
				System.out.println("Sincerely, ");
				System.out.println("Michael Akers");
				Thread.sleep(5000);
				setName("Akers' Room");
			}
			else if(response.equals("c")){
				System.out.println("The pictures all feature an old man. In some pictures he is alone, smiling into the camera. " +
				"In others he is surrounded by younger people--two young women, a young man, a small boy--all smiling happily.");
				Thread.sleep(2000);
			}
			System.out.println("Options:");
			System.out.println("a: look at the paper on the desk");
			System.out.println("b: look at the small note on the bed");
			System.out.println("c: look at the framed pictures");
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
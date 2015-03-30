import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;

public class roomSix implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(4);
	
	public roomSix(){
		name = "Room Six";
		options.add("a");
		options.add("b");
		options.add("c");
		options.add("d");
	}
	public void narration(BufferedReader in)throws InterruptedException {
		System.out.println("This room is very dark. There are piles of clothing and dishes on the floor, and the blinds are drawn. " + 
			"There are two pieces of paper lying on the unmade bed.");
			Thread.sleep(1500);
			System.out.println("You are in " + name);
			Thread.sleep(1000);
			System.out.println("Options:");
			System.out.println("a: look at the larger paper");
			System.out.println("b: look at the smaller paper");
			System.out.println("c: leave the room");
		
		String response = input.nextLine();
			while(!response.equals("c")){
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
					System.out.println("Ms. Ashworth, ");
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
					System.out.println("Your failing mental health is putting strain on the productivity of our community. " +
					"You are no longer capable of fulfilling the values of the community detailed to you at the start of your residency. " +
					"Additionally, your insistence to burden the rest of the community with the problems you're facing " +
					"is in direct violation of the community's values of peaceful coexistence.");
					Thread.sleep(5000);
					System.out.println("");
					System.out.println("Your participation in this community has been, overall, a failure " +
					"and thus we must insist upon your departure.");
					Thread.sleep(1000);
					System.out.println("");
					System.out.println("Yours,");
					System.out.println("The council.");	
				}
				
				else if(response.equals("b")){
					System.out.println("It reads:");
					Thread.sleep(1000);
					System.out.println("");
					System.out.println("To all my friends and neighbors, ");
					Thread.sleep(1000);
					System.out.println("");
					System.out.println("The council sent me my eviction notice this morning. To be honest, after Michael got his, " +
					"I knew it was only a matter of time until I got mine.");
					Thread.sleep(2000);
					System.out.println("The notice details my infractions, and explains 'that to burden the rest of my community with my problems'" + 
					"was to 'violate the values of peaceful coexistence.' ");
					System.out.println("");
					Thread.sleep(2000);
					System.out.println("Now that I see it in writing, though, I can be absolutely sure that the council has no aspirations of creating " +
					"a healthy community. I won't be around much longer, but the rest of you will be stuck here until the council deems you unfit, " +
					"just like me and Michael.");
					System.out.println("");
					Thread.sleep(3000);
					System.out.println("Before I leave, I want to thank each and every one of you for the help you offered me, " +
					"even though it was a direct violation of the community values. " +
					"I'll remember your kindness for the rest of my life, however long that might be. " +
					"Do me one last favor, and start being suspicious. You don't deserve to live like this. ");
					System.out.println("");
					Thread.sleep(4000);
					System.out.println("Sincerely,");
					System.out.println("");
					System.out.println("Kadian");
					setName("Kadian's room");
				}

				System.out.println("Options:");
				System.out.println("a: look at the larger paper");
				System.out.println("b: look at the smaller paper");
				System.out.println("c: leave the room");
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
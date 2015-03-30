import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;

public class roomFour implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(3);
	//PlaySound sound = new PlaySound("mixtape.wav");
	
	//public void setSound(PlaySound sound){
		//this.sound = sound;
	//}
	
	public roomFour(){
		name = "Room Four";
		options.add("a");
		options.add("b");
		options.add("c");
	}
	//public void stopSound(){
		//sound.Stop();
	//}
	public void narration(BufferedReader in)throws InterruptedException{
		System.out.println("This room is small. There is a note " +
		"on the dresser and a tape labelled 'to Val love Joy' next to a " +
		"CD player on the floor.");
		Thread.sleep(1500);
		System.out.println("You are in " + name);
		Thread.sleep(1000);
		System.out.println("Options:");
		System.out.println("a: read the note on the bed");
		System.out.println("b: play the mixtape");
		System.out.println("c: leave");

		String response = input.nextLine();
		while(!response.equals("c")){
			if(!options.contains(response)){
				try{in.read();}
				catch(IOException e){
					System.out.println("Exception: " + e.getMessage());
					return;
				}
			}
			
			else if(response.equals("b")){
				//try{
					//sound.playSound();
				//} catch(Exception e){
					//System.out.println("Exception: " + e.getMessage());
					//return;
				//}
			}
			
			else if(response.equals("a")){
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("It reads: ");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Eviction Notice");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Ms. Scriven, ");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("We regret to inform you that you have violated " +
				"the terms of your residence here and thus have exactly one week " +
				"to remove yourselves from the premises or an agent will arrive to carry out " +
				"your termination.");
				Thread.sleep(4000);
				System.out.println("");
				System.out.println("The circumstances of your breech of contract are such: ");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Your relationship with Ms. Simmons violates our community's dedication to humanity's future prosperity. " +
				"Such a relationship contributes nothing to our community's health and " +
				"in fact robs it of its viability.");
				Thread.sleep(4000);
				System.out.println("");
				System.out.println("This discretion is made worse by your refuse to accept " +
				"the more healthy and productive relationship with Mr.Harrison prescribed to you by this council");
				Thread.sleep(2000);
				System.out.println("");
				System.out.println("Your participation in this community has been, overall, a failure " +
				"and thus we must insist upon your departure.");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Yours,");
				System.out.println("The council.");
			}
			System.out.println("Options:");
			System.out.println("a: read the note on the bed");
			System.out.println("b: play the mixtape");
			System.out.println("c: leave");
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

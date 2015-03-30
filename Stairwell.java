import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Stairwell implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(4);
	roomFour roomfour = new roomFour();
	//PlaySound sound = new PlaySound("no children.wav");
	
	public Stairwell(){
		name = "Staircase";
		options.add("a:");
		options.add("b:");
		options.add("c:");
	}
	public void setroomFour(roomFour roomfour){
		this.roomfour = roomfour;
	}
	public void narration(BufferedReader in)throws InterruptedException{
		System.out.println("The room is small and empty except for a "
		+"large computer across from the door. The computer is still on");
		System.out.println("Options:");
		System.out.println("a: think about why you are here");
		System.out.println("b: look at the computer screen");
		System.out.println("c: leave the room");
		String response = input.nextLine();
		while(!response.equals("c") && !response.equals("b")){
			if(!options.contains(response)){
				try{
					in.readLine();
				}
				catch(IOException e){
					System.out.println("Exception: " + e.getMessage());
					return;
				}
			}
			if(response.equals("a")){
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("You're here to clean things up so people can live here again.");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Why, are you having second thoughts?");
			}
			System.out.println("Options:");
			System.out.println("a: think about why you are here");
			System.out.println("b: look at the computer screen");
			System.out.println("c: leave the room");
			response = input.nextLine();
			
		}
		if(response.equals("c")){
			System.out.println("You leave the room");
			return;
			}
		else if(response.equals("b")){
				roomfour.stopSound();
				System.out.println("");
				Thread.sleep(1000);
				System.out.println("You look at the monitor.");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("The screen is split into several different videos");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("Each one is of a different room in the building");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("You look down onto people's beds, their broken things, their dead things");
				Thread.sleep(1000);
				System.out.println("");
				Thread.sleep(500);
				System.out.println("");
				Thread.sleep(500);
				System.out.println("");
				Thread.sleep(500);
				System.out.println("It's time to start cleaning up.");
				//try{
					//sound.playSound();
				//} catch(Exception e){
					//System.out.println("Exception: " + e.getMessage());
					//return;
				//}
				Thread.sleep(500);
				for(int i = 0; i < 6;i++){
					System.out.println("");
				}
				Thread.sleep(500);
				System.out.println("created by Kassandra and Bri");
				System.out.println("music by the Beatles,Mary Lambert,Maroon 5,Alessandro Safina");
				System.out.println("many thanks, endless gratitude to Julia, Beth and Emma^2 for your help");
				System.out.println("end.");
				System.exit(0);
			}
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
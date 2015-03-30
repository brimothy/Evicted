import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

public class story{
	BufferedReader in; 
	ArrayList<Room> rooms;
	Key key = new Key();
	//PlaySound sound = new PlaySound("mixtape.wav");
	roomFour roomfour;
	public story(){
		rooms = new ArrayList<Room>(10);
		roomTwo roomtwo = new roomTwo();
		roomfour = new roomFour();
		Stairwell stairwell = new Stairwell();
		//stairwell.setroomFour(roomfour);
		//roomfour.setSound(sound);
		//roomtwo.setKey(key);
		rooms.add(new roomOne());
		rooms.add(roomtwo);
		rooms.add(new roomThree());
		rooms.add(roomfour);
		rooms.add(new roomFive());
		rooms.add(new roomSix());
		rooms.add(stairwell);
	}
	//public void stopSound(){
		//roomfour.stopSound();
	//}
	public void firstnarration()throws InterruptedException{
		rooms.get(0).narration(in);
	}
	
	public void hallway() throws InterruptedException{
		Scanner input = new Scanner(System.in);
		ArrayList<String> options = new ArrayList<String>(7);
		options.add("a");
		options.add("b");
		options.add("c");
		options.add("d");
		options.add("e");
		options.add("f");
		options.add("g");
		while(true){
			System.out.println("You are in the hallway");
			Thread.sleep(1000);
			System.out.println("Options: ");
			Thread.sleep(1000);
			System.out.println("a: enter " + rooms.get(0).getName());
			Thread.sleep(1000);
			System.out.println("b: enter " + rooms.get(1).getName());
			Thread.sleep(1000);
			System.out.println("c: enter " + rooms.get(2).getName());
			Thread.sleep(1000);
			System.out.println("d: enter " + rooms.get(3).getName());
			Thread.sleep(1000);
			System.out.println("e: enter " + rooms.get(4).getName());
			Thread.sleep(1000);
			System.out.println("f: enter " + rooms.get(5).getName());
			Thread.sleep(1000);
			System.out.println("g: enter " + rooms.get(6).getName());
			String response;
			response = input.nextLine();
			while(!options.contains(response)){
					try{
						in.readLine();
					}
					catch(IOException e){
						System.out.println("Exception: " + e.getMessage());
						return;
					}
			}
			if(response.equals("a")){
				rooms.get(0).narration(in);
			}
			if(response.equals("b")){
				//room 2
				rooms.get(1).narration(in);
			}
			if(response.equals("c")){
				rooms.get(2).narration(in);
			}
			if(response.equals("d")){
				if(key.getValue()){
					rooms.get(3).narration(in);
				}
				else if (!key.getValue()){
					System.out.println("The room is locked");
				}
			}
			if(response.equals("e")){
				rooms.get(4).narration(in);
			}
			
			if(response.equals("f")){
				rooms.get(5).narration(in);
			}
			if(response.equals("g")){
				rooms.get(6).narration(in);
			}
		}
	}
	
	public static void main(String [] args) throws InterruptedException{
		story Story = new story();
		
		
		ArrayList<String> twoanswers = new ArrayList<String>(2);
		twoanswers.add("a");
		twoanswers.add("b");
		
		ArrayList<String> oneanswer = new ArrayList<String>(1);
		twoanswers.add("a");
		
		
		try{
			Story.in = new BufferedReader(new FileReader("creepy responses.txt"));
		}
		catch (FileNotFoundException e){
			System.out.println("Exception: " + e.getMessage());
			return;
		}
		Scanner input = new Scanner( System.in );
		String userinput;
		//background noises
		for(int i = 0; i < 6; i++){
			System.out.println("");
		}
		Thread.sleep(2000);
		System.out.println("                            Eviction");
		Thread.sleep(3000);
		for(int i = 0; i < 6; i++){
			System.out.println("");
		}
		Thread.sleep(2000);
		System.out.println("You are in a dark room.");
		System.out.println("");
		Thread.sleep(2000);
		System.out.println("Options:");
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("(enter the letter of the option to choose)");
		System.out.println("");
		Thread.sleep(1000);
		System.out.println("a: look for a light switch");
		Thread.sleep(1000);
		System.out.println("b: cry");
		userinput = input.nextLine();
		
		boolean proceed = false;
		while(proceed == false){
			
			if(userinput.equals("b") || userinput.equals("B")){
				System.out.println("");
				System.out.println("You cry.");
				Thread.sleep(1500);
				System.out.println("");
				System.out.println("Options:");
				System.out.println("a: look for a light switch");
				userinput = input.nextLine();
			}
			
			if(userinput.equals("a") || userinput.equals("A")){
				proceed = true;
			}
			
			else{
				while(!twoanswers.contains(userinput)){
					System.out.println("");
					try{
						System.out.println(Story.in.readLine());
					}
					catch(IOException e){
						System.out.println("Exception: " + e.getMessage());
						return;
					}
					userinput = input.nextLine();
				}
				
			}
		}
		
		System.out.println("");
		System.out.println("You turn on the light.");
		System.out.println(" ");
		Thread.sleep(2000);
		
		Story.firstnarration();
		System.out.print("You leave the room to find yourself in a dark hallway. ");
		Thread.sleep(1500);
		System.out.println("There are several doors down both sides.");
		Thread.sleep(1500);
		Story.hallway();
	}
}

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class roomTwo implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(5);
	roomtwob b = new roomtwob();
	roomtwoa a = new roomtwoa();
	Key key = new Key();
	public roomTwo(){
		//b = new roomtwob();
		name = "Room Two";
		options.add("a");
		options.add("b");
		options.add("c");
		options.add("d");
		options.add("e");
	}
	
	public void setKey(Key key){
		this.key = key;
		b.setKey(this.key);
	}
	public void updateKey(boolean value){
		this.key.setValue(value);
	}

	public void narration(BufferedReader in)throws InterruptedException{
		System.out.println("This room is larger than the others and has two doors" +
		" leading to other rooms. There are crayons and childish drawings on the floor." +
		"");
		Thread.sleep(1500);
		System.out.println("You are in " + name);
		Thread.sleep(1000);
		System.out.println("Options:");
		System.out.println("a: look at the drawings");
		System.out.println("b: enter the room straight ahead");
		System.out.println("c: enter the room to the right");
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
				Thread.sleep(1000);
				System.out.println("You look at the drawings.");
				Thread.sleep(1000);
				System.out.println("The first drawing is of four stick figures. " +
				"The figures are labelled in messy handwriting 'Mom', 'Dad', 'Joy' and 'me." +
				" Underneath the figures the drawing reads: 'Simmons'");
				Thread.sleep(4000);
				System.out.println("");
				System.out.println("The second drawing is of a single stick figure " +
				"with a white rectangle on its arm. " + 
				"It reads, in the same sloppy handwriting: " +
				"'Me with broken arm. I was bored so I ran down the stairs and fell.'");
				Thread.sleep(4000);
				System.out.println("");
				System.out.println("The third drawing is of three figures, two tall with " +
				"triangular dresses and one short. It reads, 'Me and Joy and Val'");
				setName("Simmons' Rooms");
				Thread.sleep(2000);
			}
			
			else if(response.equals("b")){
				a.narration(in);
			}
			else if(response.equals("c")){
				b.narration(in);
			}
			Thread.sleep(1000);
			System.out.println("Options:");
			System.out.println("a: look at the drawings");
			System.out.println("b: enter the room straight ahead");
			System.out.println("c: enter the room to the right");
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
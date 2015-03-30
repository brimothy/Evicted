import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class hallway extends story{
	Scanner input = new Scanner(System.in);
	ArrayList<String> options = new ArrayList<String>(6);
	public hallway(){
		options.add("a");
		options.add("b");
		options.add("c");
		options.add("d");
		options.add("e");
		options.add("f");
	}
	public void narration(){
		String response;
		Thread.sleep(1500);
		System.out.println("You are in the hallway");
		Thread.sleep(1000);
		System.out.println("Options: ");
		Thread.sleep(1000);
		System.out.println("a: enter " + super.rooms.get(1));
		Thread.sleep(1000);
		System.out.println("b: enter" + super.rooms.get(2));
		Thread.sleep(1000);
		System.out.println("c: enter" + super.rooms.get(3));
		Thread.sleep(1000);
		System.out.println("d: enter" + super.rooms.get(4));
		Thread.sleep(1000);
		System.out.println("e: enter" + super.rooms.get(5));
		
		response = input.nextLine();
		while(!options.contains(response)){
				try{
					super.in.readLine();
				}
				catch(IOException e){
					System.out.println("Exception: " + e.getMessage());
					return;
				}
		}
		if(response.equals("a")){
			room1.narration();
		}
}
}
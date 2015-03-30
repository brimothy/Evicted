import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class roomOne implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(4);
	
	public roomOne(){
		name = "Room One";
		options.add("a");
		options.add("b");
		options.add("c");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void narration(BufferedReader in) throws InterruptedException{
		System.out.print("The room has clean white walls. ");
		Thread.sleep(1000);
		System.out.print("Dust coats the sparse furniture: a bed, a chair and a desk. ");
		Thread.sleep(1000);
		System.out.print("There's a picture frame and a crumpled note on the desk,");
		Thread.sleep(1000);
		System.out.print("and several withered plants on the windowsill. ");
		Thread.sleep(1000);
		System.out.print(" It's dark outside. ");
		Thread.sleep(1000);
		System.out.print("There are splatters of dried blood on the white carpet and");
		Thread.sleep(1500);
		System.out.println(" a shattered lamp lies by the bed.");
		Thread.sleep(1000);
		System.out.println("The door is slightly ajar.");
		
		Thread.sleep(2500);
		System.out.println();
		System.out.println("");
		Thread.sleep(1000);
		String response;
		System.out.println("You are in " + name);
		
		Thread.sleep(1000);
		System.out.println("Options: ");
		Thread.sleep(1000);
		System.out.println("a: look at the crumpled note");
		Thread.sleep(1000);
		System.out.println("b: look at the framed picture ");
		Thread.sleep(1000);
		System.out.println("c: leave the room");
		response = input.nextLine();
		while(!response.equals("c")){
			while(!options.contains(response)){
				try{
					System.out.println(in.readLine());
				}
				catch(IOException e){
					System.out.println("Exception: " + e.getMessage());
					return;
				}
				response = input.nextLine();
			}

		if(response.equals("a")){
			System.out.println("You pick up the note.");
			Thread.sleep(1000);
			System.out.println("It reads: ");
			Thread.sleep(1000);
			System.out.println("Val - ");
			Thread.sleep(1000);
			System.out.println("");
			System.out.print("Kadian is gone. If this keeps up there won't be many " +
			"of us left.");
			Thread.sleep(1500);
			System.out.print(" [Here there is a sentence crossed out too heavily to read] ");
			Thread.sleep(1500);
			System.out.print("Don't worry though, I'm not going to let that happen to you.");
			Thread.sleep(1000);
			System.out.println("");
			System.out.println("- Rowan");
			if(name.equals("Room One")){
				setName("Rowan's Room");
			}
		}
		else if(response.equals("b")){
			System.out.println("You look at the picture.");
			Thread.sleep(1000);
			System.out.print("There are three smiling people in the picture - ");
			Thread.sleep(1000);
			System.out.print("two teenaged girls and one teenaged boy in front of a blank white wall.");
			Thread.sleep(1000);
			System.out.println("");
		}
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println("Options: ");
		Thread.sleep(1000);
		System.out.println("a: look at the crumpled note");
		Thread.sleep(1000);
		System.out.println("b: look at the framed picture ");
		Thread.sleep(1000);
		System.out.println("c: leave the room");
		response = input.nextLine();
		
	}
	return;

	}
}
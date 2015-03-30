import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class roomtwob implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(4);
	boolean key;
	
	public roomtwob(){
		key = false;
		name = "unknown";
		options.add("a");
		options.add("b");
		options.add("c");
		options.add("d");
	}
	public void narration(BufferedReader in)throws InterruptedException{
		Thread.sleep(1000);
				System.out.println("You enter the room.");
				Thread.sleep(1000);
				System.out.println("The walls of this room are covered in artwork. " +
				"Some are a child's crayon drawings and others are skillful " +
				"paintings and drawings of people are animals " +
				"There are two pieces of paper and a key on the dresser.");
				Thread.sleep(3000);
				System.out.println("");
				System.out.println("Options:");
				String response;
				boolean leave = false;
				while(!leave){
					if(!key){
						System.out.println("a: look at the first paper");
						System.out.println("b: look at the other paper");
						System.out.println("c: take the key");
						System.out.println("d: leave the room");
						response = input.nextLine();
						
						if(!options.contains(response)){
							try{in.read();}
							catch(IOException e){
								System.out.println("Exception: " + e.getMessage());
								return;
							}
							response = input.nextLine();
						}
						
						if(response.equals("c")){
							Thread.sleep(1000);
							System.out.println("You take the key.");
							key = true;
						}
						else if (response.equals("a")){
							Thread.sleep(1000);
							System.out.println("Joy, ");
							Thread.sleep(1000);
							System.out.println("");
							Thread.sleep(1000);
							System.out.println("As you can probably tell, I have never " +
							"really written a love letter before and it does not really come " +
							"naturally to me. But, I think it is better to try to do something " +
							"and look silly than be one of those people who aren't willing to try." +
							"So you aren't allowed to make fun of me.");
							Thread.sleep(4500);
							System.out.println("I wrote this while listening to the mix tape you gave me");
							Thread.sleep(1000);
							System.out.println("");
						}
						else if (response.equals("b")){
							Thread.sleep(1000);
							System.out.println("");
							System.out.println("It reads: ");
							Thread.sleep(1000);
							System.out.println("");
							System.out.println("Eviction Notice");
							Thread.sleep(1000);
							System.out.println("");
							System.out.println("Ms. Simmons, ");
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
							System.out.println("Your relationship with Ms. Scriven, whom you are aware is paired with " +
							"Mr. Harrison, violates our community's dedication to humanity's future prosperity. " +
							"Such a relationship contributes nothing to our community's health and " +
							"in fact robs it of its viability.");
							Thread.sleep(4000);
							System.out.println("");
							System.out.println("Your participation in this community has been, overall, a failure " +
							"and thus we must insist upon your departure.");
							Thread.sleep(1000);
							System.out.println("");
							System.out.println("Yours,");
							System.out.println("The council.");
						}
						
					}
				System.out.println("a: look at the first paper");
				System.out.println("b: look at the other paper");
				System.out.println("c: leave the room");
				response = input.nextLine();
				}
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public boolean hasKey(){
		return key;
	}
}
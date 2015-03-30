import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class roomtwoa implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(4);
	
	public roomtwoa(){
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
				System.out.println("The room contains a large bed. On the bed is a sheet of paper. " +
				"There is a pile of empty beer cans in the corner. " +
				"Dead flowers lie on the floor in the shattered remains of a vase");
				Thread.sleep(1500);
				System.out.println("");
				System.out.println("Options: ");
				System.out.println("a: look at the paper");
				System.out.println("b: leave the room");
				String response;
				response = input.nextLine();
				while(!response.equals("b")){
					if(response.equals("a")){
						Thread.sleep(1500);
						System.out.println("The paper reads: ");
						Thread.sleep(1500);
						System.out.println("");
						System.out.println("Eviction Notice");
						System.out.println("");
						Thread.sleep(1500);
						System.out.println("Mr. and Mrs. Simmons:");
						System.out.println("");
						Thread.sleep(1000);
						System.out.println("We regret to inform you that you have violated " +
						"the terms of your residence here and thus have exactly one week " +
						"to remove yourselves from the premises or an agent will arrive to carry out " +
						"your termination.");
						Thread.sleep(4000);
						System.out.println("");
						System.out.println("The circumstances of your breech of contract are such: ");
						Thread.sleep(1000);
						System.out.println("");
						System.out.println("Firstly, your inadequate parenting, including your neglect " +
						"of your youngest child has led to his injury and violates our principles of healthy " +
						"coexistence. Furthermore, his education at your hands has been considerably lacking, " +
						"demonstrating your lack of dedication to the re-building of our society.");
						Thread.sleep(4000);
						System.out.println("");
						System.out.println("Secondly, we must assert that we find you partially responsible " +
						"for your older child's own violations of our community values.");
						Thread.sleep(1000);
						System.out.println("");
						System.out.println("Your participation in this community has been, overall, a failure " +
						"and thus we must insist upon your departure.");
						Thread.sleep(1000);
						System.out.println("");
						System.out.println("Yours,");
						System.out.println("The council.");
					}
					//else{
						//try{in.read();}
							//catch(IOException e){
								//System.out.println("Exception: " + e.getMessage());
								//return;
							//}
							//response = input.nextLine();
					//}
					System.out.println("");
					System.out.println("Options: ");
					System.out.println("a: look at the paper");
					System.out.println("b: leave the room");
					response = input.nextLine();
				}
				System.out.println("You leave the room.");
				return;
}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
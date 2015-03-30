import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class defaultRoom implements Room{
	Scanner input = new Scanner(System.in);
	String name;
	ArrayList<String> options = new ArrayList<String>(4);
	
	public defaultRoom(){
		name = "unknown";
		options.add("a");
		options.add("b");
		options.add("c");
		options.add("d");
	}
	public void narration(BufferedReader in)throws InterruptedException{}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
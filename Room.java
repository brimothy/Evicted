import java.io.BufferedReader;
public interface Room{
	public void narration(BufferedReader in)throws InterruptedException;
	public String getName();
	public void setName(String name);
}
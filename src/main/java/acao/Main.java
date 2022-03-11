import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner sc1 = new Scanner(System.in);
    	ArrayList<String> list = new ArrayList<>();
    	
    	while (sc1.hasNext()) {
    		String texto = sc1.nextLine();
    		if (!list.contains(texto)) {
    			list.add(texto);
    		}
    	}
    	System.out.println(list.size());
    }
}
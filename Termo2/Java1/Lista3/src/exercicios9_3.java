import java.util.Random;

public class exercicios9_3 {
	public static void main(String[] args) {
		Random generator = new Random();
        int fi = 1, x = 0, y = 0;
        int random = generator.nextInt(30);
        
        for (int i=0; i<random; i++) {
        	System.out.println(fi);
        	y = fi + x;
        	x = fi; 
        	fi = y;
        	
        };
        
	}
	
}

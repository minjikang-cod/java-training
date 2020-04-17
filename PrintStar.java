import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar{
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(bfr.readLine());
        
        for (int i=1;i<=count;i++) {
        	for (int j=0; j<i;j++) {
        		bfw.write("*");
        	}
        	bfw.write("\n");
        }
        for(int i=count-1;i>0;i--) {
        	for(int j=i;j>0;j--) {
        		bfw.write("*");
        	}
        	bfw.write("\n");
        }
        
        bfw.flush();
        bfw.close();
    }
}
        

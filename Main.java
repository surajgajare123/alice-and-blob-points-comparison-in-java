import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int alicept = 0;
	    int blobpt = 0;
	    int[]  a = new int[3];
	    for(int i = 0; i < 3; i++){
	        a[i] = sc.nextInt();
	    }
	    int[] b = new int[3];
	    for(int i = 0; i < 3; i++){
	        b[i] = sc.nextInt();
	    }
	    for(int i = 0; i < 3; i++){
	        if(a[i]>b[i]){
	            alicept++;
	        }else if(a[i] < b[i]){
	            blobpt++;
	        }	    
	        
	    }
	    System.out.println("alicepoint is  : " + alicept);
	    System.out.println("blobpoint is : " + blobpt);
	
	}
}

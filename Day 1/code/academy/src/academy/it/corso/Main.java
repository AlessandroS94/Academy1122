package academy.it.corso;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = fattoriale (5) ;
		System.out.println(num);
		

	}
	
	public static int fattoriale(int n){
	    if(n < 0)
	        return -1;
	    if(n == 0)
	        return 1;
	    return n * fattoriale(n-1);
	}


    
    
}

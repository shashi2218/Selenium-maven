package Programfirst;

public class Getfactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i <= 100; i++) {
			System.out.print("Factors of " + i + ": "); 
			for(int j = 2; j < i; j++)
			if((i%j) == 0)
				System.out.print(j + " "); 
			System.out.println();
			}	
		}

}

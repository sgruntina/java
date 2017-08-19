package diadia.lettori;

import java.util.Scanner;

public class Lettore {
	
	private Scanner scanner; 
	
	public Lettore(){
		this.scanner = new Scanner(System.in);
	}
	
	public int leggiIntero(){
		return this.scanner.nextInt();
	}
	
	public boolean leggiBooleano(){
		return this.scanner.nextBoolean();
	}
	
	public double leggiDouble(){
		return this.scanner.nextDouble();
	}
	
	public String leggiString(){
		return this.scanner.nextLine();
	}

}

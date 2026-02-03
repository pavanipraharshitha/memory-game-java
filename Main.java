package demo;


import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		int i;
		char ask ='y';
		System.out.println("Welcome!");
		while(ask=='y'||ask=='Y') {
			System.out.print("Want to play with words or the numbers(w/n): ");
			char sel=s.next().charAt(0);
			if(sel=='n'||sel=='N') {
			long num=(int)(Math.random()*90000)+100;
			System.out.println("Remember this value!");
			System.out.println("👉  "+num);
			
			Thread.sleep(1000);
			
			for(i=0;i<30;i++) {
				System.out.println();
			}
			System.out.println("Guess the number:");
			int guess=s.nextInt();
			if(guess==num) {
				System.out.println("Great! Your Right🥳");
			}
			else {
				System.out.println("Corret Answer " +num);
				System.out.println("Wrong! Better luck next time😁");
				
			}
			}
			else {
				String[] str= {"Naruto", "Doraemon", "Shinchan", "Pikachu", "Goku", "Luffy", "Nobita", "Tom", "Jerry", "SpongeBob",
						"Scooby", "Ben10", "Oggy", "ChotaBheem", "Motu", "Patlu", "Mickey", "Donald", "BugsBunny", "Powerpuff"
			};
				Random ram=new Random();
				int index=ram.nextInt(str.length);
				System.out.println("Remember this word!");
				System.out.println("👉  "+str[index]);
				
				Thread.sleep(1000);
				
				for(i=0;i<30;i++) {
					System.out.println();
				}
				s.nextLine();
				System.out.println("Guess the word:");
				String guess1=s.nextLine();
				if(str[index].equals(guess1)) {
					System.out.println("Great! Your Right🥳");
				}
				else {
					System.out.println("Correct Answer: "+str[index]);
					System.out.println("Wrong! Better luck next time😁");
				}
			
			}
			System.out.print("Want to play again?(y/n)");
			ask=s.next().charAt(0);
		}
		s.close();
		System.out.println("Thanks For Playing🧠");
	}}
//you have to import classes that are not automatically included
import java.util.Scanner;

//the Class is what contains all your code, including methods, objects, and variables, and literally anything else
public class Example {
	
	//A Scanner looks through a String.
	//This Scanner looks through user input (System.in) from the console.
	public static Scanner sc = new Scanner(System.in);
	
	//The main method is required for the program to start.
	//It's basically where the computer looks first in the program. This method doesn't need to be called from another method.
	public static void main(String[] args) {
		System.out.println("i am computer; What's your name?");
		String name = sc.nextLine();
		nameGame(name);
	}
	
	//let's play the name game ...
	public static void nameGame(String name) {
		if (!name.equals("computer")) {
			if(name.contains(";")) {
				System.out.println("Good!!! Fantastic name, love this one, keep up the good work " + name);
				
			}
			else if(name.contains("g")||name.contains("G")) {
				System.out.println("computer i am, I do not like the letter g, dispose of it please\n wiht java built in garbage collecting, i do not like it computer i am. What's your new name?");
				nameGame(sc.nextLine());
			}	
			else if (name.length()>=10) {
				System.out.println("Ummmmmm... that name \"" + name + "\" is too long, pick a new one please it hurt my eyyes to look at a name so long\n new name?");
				nameGame(sc.nextLine());
			}
			else if (name.length()<=2) {
				System.out.println("that \"" + name + "\" isnt your real name, that's too short, tell me the real one please, do not lie to me");
				nameGame(sc.nextLine());
			} else if (name.matches(".*\\d+.*")) {
				System.out.println("Oh. I don't like it. That's too many numbers for me, even I, \"computer\", don't do numbers in my name.\nPick a new one. ");
				nameGame(sc.nextLine());
			} else if((name.contains("l")||name.contains("L"))&&(name.contains("n")||name.contains("N"))) {
				System.out.println("Oh hello " + name + " I think I know you from somewhere, were you in the Bahamas on August 10 2007 at 4:21PM?");
				nameGame(sc.nextLine());
			} else {
			System.out.println("Oh \"" + name + "\" is a nice name, quite a name. my name is computer. And what is yours?");
			nameGame(sc.nextLine());
			}
		}
		else {
			System.out.println("Oh.... my name is computer as well ...... this is awkward .....\n no avoiding it, you will have to pick a new one .... what name do you pick?");
			nameGame(sc.nextLine());
		}
	}

}

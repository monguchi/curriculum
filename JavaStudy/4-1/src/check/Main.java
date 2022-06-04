package check;

import constants.Constants;

public class Main {

	private static String firstName="門口";
	private static String lastName ="絵里菜";
	
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド→"+ firstName+lastName);
		
	}
	
		public static void main(String[] args) {
			
			Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
			RobotPet robotPet =new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
			
			printName(firstName,lastName);
		    pet.introduce();
		    pet.introduce();
			
		}
		
		
		

	}



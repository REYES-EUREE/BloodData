import java.util.*;

public class RunBloodData{
	public static void main (String[] args) {
    	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Bloodtype of patient: ");
	
		String input1 = s.nextLine();
	
	System.out.println("Enter the Rhesus factor(+ or -): ");
	
	String input2 = s.nextLine();

	if(input1.equals("O")){
		BloodData bd = new BloodData(input1,input2);
		
	if(input2.equals("+")){
		
		bd.display();
	}
	else if(input2.equals("-")){
		
	bd.display();
	}
	else{
		System.out.println("Invalid input!");
	}
}
	else if(input1.isEmpty()){
		
		BloodData bd = new BloodData();
		
	if(input2.isEmpty()){
		
		bd.display();
}
	else{
	System.out.println("invalid input!");
	}
}
	else if(input1.equals("A") ){
		BloodData bd = new BloodData(input1,input2);
		
	if(input2.equals("+")){
		bd.display();
}
	else if(input2.equals("-")){
		bd.display();
}
	else{
		System.out.println("Invalid input!");
	}
}

	else if(input1.equals("B")){
		BloodData bd = new BloodData(input1,input2);
		
	if(input2.equals("+")){
		bd.display();
}
	else if(input2.equals("-")){
		bd.display();
}
	else{
	System.out.println("Invalid input!");
	}
}
	else if(input1.equals("AB")){
		BloodData bd = new BloodData(input1,input2);
	
	if(input2.equals("+")){

		bd.display();
}
	else if(input2.equals("-")){

		bd.display();
}
	else{
	System.out.println("You entered wrong input!");
	}
  }
}
}

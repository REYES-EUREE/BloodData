class BloodData{
	public static String bloodType;
	public static String rhFactor;
	
	
	public BloodData(){
	String bloodtype = "O";
	String rhFactor = "+";
	 		
		}
		
	public BloodData(String bt,String rh){
		bloodType = bt;
		rhFactor = rh;
		
		}	
	public void display(){
		System.out.println(bloodType + rhFactor + " is added to the blood bank.");
		
		}
	
	
	}
	
	
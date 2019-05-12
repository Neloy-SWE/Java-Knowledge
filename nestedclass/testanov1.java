package nestedclass;

class testanov1{
	public static void main(String[] args) {
		
		
		new anonymous1v1() {
			/*
			 * eikhane muloto nested class er kaj ta hoye gechhe
			 * ei khane interface er method override hoyechhe
			 */
			@Override
			public void name() {
				System.out.println("Boss is the best");
				
			}
		}.name();
		
		/*
		 * eikhane new theke suru kore .name er ag porjonto ekta inner 
		 * class jeta ekta object hisebe kaj korechhe
		 * ar .name(); add kore dekhano hoyechhe je object.method();
		 * 
		 * ar jehetu object er kono nam ba variable nai sehetu bojhai jai
		 * je eta ekta anonymous 
		 */
	}
}

class PraticeCons2{
	int modelyear;
	String modeName;
	
	public PraticeCons2(int year,String name){
		modelyear=year;
		modeName=name;
	}
	
	public static void main(String args[]){
		PraticeCons2 pCons2= new PraticeCons2(1999,"Chandan");
		
		System.out.println(pCons2.modelyear+" "+pCons2.modeName);
	}
}
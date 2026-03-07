public class spring{
	public void Spring_season(int month,int date){
		if((month==3 && date>=20) || (month==4) || (month==5) || (month==6 && date<=20 ))
		{
			System.out.println("spring season: ");
		}
		else{
			System.out.println("not spring season");
		}
	}
	public static void main(String args[]){
		spring s=new spring();
		s.Spring_season(5,25);
	}
}
package Morpion;

public class Main {

	public static void main(String[] args) {
		Integer nums[] ={-38,-9,-5,30} ;
		
		ClosestToZero(nums);
	}
	
	
	public static void ClosestToZero(Integer nums[]) {
		
		try {
			int min=nums[0];
			int listeSize= nums.length;
			
			for(int j=1;j<listeSize;j++) {
				if(Math.abs(nums[j])<Math.abs(min)){ // on compare ici le valeur absolu du min avec le min de la valeur absolu de la valeur de la liste pour savoir lequel est le plus près de 0 
					min=(nums[j]);
				}
				if(min<0&&nums[j]==Math.abs(min))
					min=nums[j];
			}
			System.out.println("The number closest to zero is : "+ min);

		}catch(Exception e) {
			if(nums==null) {
				System.out.println("The list is null");
			}
		}
	}
}

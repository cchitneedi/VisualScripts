import java.util.Scanner;

public class generaldata {

	public static void main(String[] args) {
		int[] arr1 = new int[4];
		arr1[0] = 1;
		arr1[1] = 11;
		arr1[2] = 10;
		
		// If values are known, then
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		//System.out.print("Print here "+arr2[3]);
		for(int i=5; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
			
		}
		String[] name = {"Charan", "Sai", "Teja"};
//		for(int i=0; i<name.length;i++) {
//			System.out.print(name[i]);
//		}
		
		//enhanced for loop syntax
		for(String n : name) {
			if(n!="Sai") {
				System.out.println(n);
			}
			
		}
		
		for(int i=0; i<arr2.length;i++)
		{
			if(arr2[i]%2 == 0) {
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println(arr2[i]+" are not mutiples of 2");
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("Reverse number is: "+rev);
		
		
		
		
		

	}

}

package Tcs_digital;


import java.util.Scanner;
import java.lang.*;

public class Assignment3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum =0;
		System.out.println("---- Welcome To Food Counter ----");
		System.out.println("Press 1. To view Our Menu");
		System.out.println("Press 2. To Order Products");
		System.out.println("Press 3. To Make Payment");
		System.out.println("Press 4. To Give Rating");
		System.out.println("Press 5. To exit");
		int n =1;
		while(n==1) {
		
			int choice = sc.nextInt();
			if(choice==1)
			{
				System.out.println("Our Menu Items");
				System.out.println("1. French Fries\t $10");
				System.out.println("2. Pizza\t $30");
				System.out.println("3. Ice Cream\t $10");
				System.out.println("4. Burger With Cheese\t $30");
				System.out.println("5. Soft Drinks\t $10");
				System.out.println("6. Donut\t $15");
				System.out.println("7. HotDog\t $20");
				System.out.println("8. Vegetable Salad\t $15");
				System.out.println("9. Choco Lava Cake\t $20");
				System.out.println("10.Italian Bread\t $20");
				System.out.println("Thanks For Viewing Our Menu Items");
				System.out.println("Would you like to place order , Enter 2 To Press Order");
				
			}
			else if(choice ==2)
			{
				System.out.println("Thanks for visting us! What would you like to order?");
				
				System.out.println("\nHow many Items would you like to order");
				String orderItem = sc.nextLine();
				//Here i used logic of highest number for Id for example , if my id is 123478 the highest number will be 8 and number of items to be ordered is 8.
				int greatest =0;
//				System.out.println("hi");
				if(orderItem.length()>1) {//error point
				for(int i=0 ; i<orderItem.length() ; i++)
				{
					char c = orderItem.charAt(i);
					char c1 = orderItem.charAt(i+1);
					greatest = Math.max(Character.getNumericValue(c),Character.getNumericValue(c));
		
				}
				}
				else
					greatest=Integer.parseInt(orderItem);
				
				String[] itemName =new String[] {"French Fries","Pizza","Ice Cream","Burger With Cheese","Soft Drinks","Donut","HotDog","Vegetable Salad","Choco Lava Cake","Italian Bread" };
				int[] priceList = new int [] {10,30,10,30,10,15,20,15,20,20};
				while(greatest>0)
				{
					int n3=0;
					while(n3==0)
					{
					System.out.println("What you would like to order enter either number from menu or name");
					String itemSelected = sc.nextLine();
					if(itemSelected.equals("1") || itemSelected.equals(itemName[0]))
					{
						sum+=priceList[0];
						n3=1;
					}
					else if (itemSelected.equals("2") || itemSelected.equals(itemName[1]))
					{
						sum+=priceList[1];
						n3=1;
					}
						
					else if (itemSelected.equals("3") || itemSelected.equals(itemName[2]))
					{
						sum+=priceList[2];
						n3=1;
					}
					else if ((itemSelected.equals("4") || itemSelected.equals(itemName[3])))
					{
						sum+=priceList[3];
						n3=1;
					}
					else if (itemSelected.equals("5") || itemSelected.equals(itemName[4]))
					{
						sum+=priceList[4];
						n3=1;
					}
					else if (itemSelected.equals("6") || itemSelected.equals(itemName[5]))
					{
						sum+=priceList[5];
						n3=1;
					}
					else if (itemSelected.equals("7") || itemSelected.equals(itemName[6]))
					{
						sum+=priceList[6];
						n3=1;
					}
					else if (itemSelected.equals("8") || itemSelected.equals(itemName[7]))
					{
						sum+=priceList[7];
						n3=1;
					}
					else if (itemSelected.equals("9") || itemSelected.equals(itemName[8]))
					{
						sum+=priceList[8];
						n3=1;
					}
					else if (itemSelected.equals("10") || itemSelected.equals(itemName[9]))
					{
						sum+=priceList[9];
						n3=1;
					}
					else 
						System.out.println("Please Enter a Valid Order.");
					}
					int n4=0;
					while(n4==0) 
					{
					System.out.println("Please enter the quantity");
					int quanity = sc.nextInt();
					if(quanity>=1)
					{
						sum*=quanity;
						n4=1;
					}
					else
						System.out.println("Please Enter Valid Greater Than 1");
					}
					greatest--;
					
				}
				System.out.println("The total Order Amount is $"+sum);
				
			}
			else if (choice ==3)
			{
				System.out.println("Thanks for placing Order, How would you like to make the system");
				System.out.println("Press 1. To Pay Via Paypal");
				System.out.println("Press 2. To Make the Cash Payment");
				int paymentChoice = sc.nextInt();
				int n2=1;//This variable is for loop
				while(n2==1)
				{
					if(paymentChoice==1) {
						System.out.println("Payment Made Sucessfully with Paypal $"+sum);
						n2=0;
					}
					else if(paymentChoice==1) {
						System.out.println("Payment Made Sucessfully with Cash $"+sum);
						n2=0;
					}
					else
						System.out.println("Please Enter Valid Payment Option");
				}
			}
			//This section is for getting the customer feedback;
			else if (choice ==4)
			{
				System.out.println("Did you liked or services\nRate US: From 1-10");
				int rating = sc.nextInt();
				int n1=1;//This variable is for loop
				while(n1==1) {
				if(rating >=0 && rating<=5)
				{
					System.out.println("We are extermely sorry, We will surely to improve our services");
					n1=0;//To terminate the while loop
				}
				else if (rating>=5 && rating <=7)
				{
					System.out.println("Thanks for rating! , We will surely improve our services");
					n1=0;
				}
				else if (rating>=8 && rating <=10)
				{
					System.out.println("Thanks we are glad to hear that");
					n1=0;
				}
				else
					System.out.println("Please Enter a valid rating");
				
				}
				
			}
			else if (choice ==5)
			{
				System.out.println("Thanks For Visting Us");
				n=0;
			}
			//if user enter some invalid number the system will ask for again for number
			else
			{
				System.out.println("Please Enter the valid Choice");
			}
		
		}
		
	}
}
package javaproject;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.*;

public class hotel {
	public static void main(String[] args) throws IOException{
		ArrayList<food> al = new ArrayList<>();
		String foodname;
		int price;
	int totalbill  ;
		int choice;
		String order;
		int ch;

		
		Scanner sc=new Scanner(System.in);

		
		while (true) {
			System.out.println(" press 1 to food name");
		
			System.out.println(" press 2 to totalbill");

			System.out.println(" press 3 to dispaly foodname and price");
			System.out.println(" press 4 to exit");
			System.out.println(" enter your choice");

			ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("enter the foodname");
				foodname = sc.next();

				food s = new food();
				s.setFoodname(foodname);
				foodname=sc.next();
				al.add(s);
				System.out.println(" record added ");
	break;			

			case 2:
				
				System.out.println("total bill");
				
				
				totalbill= sc.nextInt();
				food v = new food();
				v.setTotalbill(totalbill);
				al.add(v);
				totalbill=sc.nextInt();
				

break;
			case 3:
				for (int i = 0; i < al.size(); i++) {
					System.out.println("order:" + (i + 1));
					System.out.println("food name:" + al.get(i).getFoodname());
		
				
				System.out.println("total bill:" + al.get(i).getTotalbill());
				

				}
			break;
			
			case 4:
				System.exit(0);
			default:
			break;

			
		
		}
	}


		


			
		
	}
}




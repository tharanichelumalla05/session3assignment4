/*program to impelement type cating between different variables,taking six variables as one of each byte,short,int,long
  float,double.Initializing only byte and short.Taking byte and short variables and storing sum in the integer variable
  and printing the sum and taking short and int and storing their addition in a long variable and taking an int and long*/

package typecasting;// here I have created a package as typecasting

public class Bhavitha {
		//declares a class called Bhavitha
		//classes are the basics of opps(object oriented programming)
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
				short s = 50;
				byte b = 60;//here we have taken short and byte to initialize the values
				int I = (int)s + (int)b;
				// here by casting the values of short and byte we are inserting these values in integer data type,
				//by adding these values we are assigning them in integer " i " data type
						
				System.out.println("value of int I is  "+I);
				//system is used to return code
				//Println is used to print text and gives output of I
				long L = (long)I + (long)s;
				//by taking long data type we are inserting the the values of integer  and short in them,
				//by adding we assign them in "l"
				
				System.out.println("value of long L is  "+L);
				//system is used to return code
				//Println is used to print text and gives output of L
				float F = (float)I + (float)L; 
				// the values of long and integer are converted into float  and by adding these values ,
				//we are  assigning to the variable of float that is "F". 
				
				System.out.println("value of float F is  "+F);
				//system is used to return code
				//Println is used to print text and gives output of F
				double D =(double)F + (double)L;
				//the values of float and long are converted into long and these values are added ,
				//then the value is assigned to the variable of double that is "D". 
				
				System.out.println("value of double D is  "+D);
				//success
				//system is used to return code
				//out is a static number
				//Println is used to print text and gives output of D
				

			}

		}

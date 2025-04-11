SECTION A

1) JVM – Java Virtual Machine is used to convert java byte code to Machine code.
   JRE – Java Runtime Environment is environment that is used to run the java programs.
   JDK – Java Development Kit. It consist of JRE and it is a platform to develop java programs.

2) Primitive data types:
   int – It is used to store the interger values
   Example : int num=10;

   Char – It is used to store a single character and it is surrounded using single quotes.
   Example : char letter=’A’;

   float – It is used to store the decimal values.The value should end with the letter f.
   Example : float num = 3.5f;

   double – It is used to store the larger decimal values.
   Example : double num = 34567.98;

   boolean – It is used to store true or false values.
   Example :  boolean example=true;

   short – It is used to store the integer values that exceed the limit of int data typa
   Example : short num=12356;

   long – It is used to store the interger values that exceeds the limit of  int and short.
   Example : long num= 234578686;


3) Control statements  :  Control statements gets executed based on the given condition
    
   Example for if-else statement
     int num1=10, num2=20;
     if(num1>num2){
          System.out.println(“Number 1 is greater than number2”);
     else{
          System.out.println(“Number 2 is greater than number 1”);
     }
     }

     Output:
     Number 2 is greater than number 1

   Example for for loop 
   for(int i=1;i<=5;i++){
        System.out.println(i);
   }

  Output:
   1
   2
   3
   4
   5

4) Class : It is the blueprint for creating the object.
   Objects : Objects are instance of class which means it is created from class.

   Example: 

    class  Shapes{   // declaring class with name Shapes
         public void diffshapes(){
         System.out.println(“There are many shapes “)
}
    Shapes circle = new Shapes();  // Created object with the help of class Shapes
    circle.diffshapes(); 
}


SECTION B:

1)  int a = 5;  
    int b = 10;  
    System.out.println(++a + b++);
    Output:16
Explanation: The operator ++a will first increase the value of “a” by 1 which means a=6. The       operator b++ first prints the value of “b” and then increment the value of it by 1 which means b=10.   Since there is a + operator it will add the value of a and b (6+10) and gives the output as 16.

2) boolean x = true;  
   boolean y = false;  
   System.out.println(x && y || x);
Output: True
Explanation : The operator && returns the value as true only if both the conition is true. So here x   is true and y is false so x && y is false.
The operator || returns the values as true if any one of the value is true.
So here x&&y gives the value as false.since the value of x is true the final output will be true.

3)for(int i = 1; i <= 2; i++) {  
    for(int j = 1; j <= i; j++) {  
        System.out.print(j);  
    }  
    System.out.println();  
}

Output:
1
12
Explanation:
The outer for loop is for number of rows.So here the number of rows will be 2.
The inner loop is for values, it starts with 1 and executes till the outer loop gets executes
System.out.print(j) is used to print the value of j.
System.out.println() is used to move to a next line.

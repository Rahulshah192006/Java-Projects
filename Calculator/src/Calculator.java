import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to the calculator made by Rahul");
            System.out.println("Press 1 for addition");
            System.out.println("press 2 for substraction");
            System.out.println("press 3 for multiplication");
            System.out.println("press 4 for divide");
            System.out.println("Press 5 for exit the calculator");

            int choice = sc.nextInt();
            int number =0;
            switch (choice){
                case 1:

                    int sum = 0 ;
                    System.out.print("enter Numbers . for complete press 0 to exit");
                    while ((number =  sc.nextInt()) != 0)
                    {
                        sum = sum + number ;
                    }
                 /*   System.out.print("enter your second number");
                    int b= sc.nextInt();
                    int sol1 = a+b; */
                    System.out.println(sum);
                    break;


               case 2:
                   int sub = 0;
                   System.out.print("enter Numbers . for complete press 0 to exit");
                    while((number = sc.nextInt())!= 0){
                        sub = sub - number;
                    }
                    System.out.println(sub);
                   break;
                case 3:
                    System.out.print("Enter a number>>");
                    int g = sc.nextInt();
                    System.out.print("Enter a number>>");
                    int f = sc.nextInt();
                    int sol1 = g*f;
                    System.out.print(sol1);

                case 4:
                    System.out.print("Enter a number>>");
                    int a = sc.nextInt();
                    System.out.print("Enter a number>>");
                    int b = sc.nextInt();
                    int sol = a/b;
                    System.out.print(sol);
                case 5:
                    System.out.println("Thank you for using calculator");
                    System.exit(0);
            }
        }
    }
}



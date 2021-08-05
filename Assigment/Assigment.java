import java.util.*; 
// Relational operators
class relatiop{
    public static void main(String[] args){
        int a = 20;
        int b= 50;
        System.out.println(a != b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

    }
}
class relatiop2{
    public static void main(String[] args){
        // Marks comparition between two students
        int stu1 = 35;
        int stu2 = 39;
        System.out.println(stu1>stu2);
        System.out.println("student 2 got the highest marks"+stu2);
    }
}
class relatiop3{
    public static void main(String[] args){
        // Comparing the area of two gradens if the answer is true both the garden has same are if not false
        int gar1 = 1000;
        int gar2 = 1100;
        System.out.println(gar1 == gar2);
        System.out.println("This mean that both the garden do not have same area");
    }
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Logical operators
class Logi1{
    public static void main(String[] args){
        // this program will say true if the pen is avalable in the inventory false not
        int shop = 0; // in shop there is not pen
        int inven = 50; // in inventory has 50 pens
        System.out.println(inven>shop&&shop<inven);
        System.out.println("True because in the shop's inventory has stock of pen ");

    }
}

class Logi2{
    public static void main(String[] args){
        // This program will tell you are you eligible for driving licence
        int young = 18;
        int myage = 15;
        boolean output = young<myage;
        System.out.println(output+"This is mean i am not able to get driving licence at the current age");
    }
}
class Logi3{
    public static void main(String[] args){
        // tells you is your phone to keep for charging
        // If true no need to charge phone
        // if false charge your phone
        int mybatlevel = 55;
        int minibatlevel = 50;
        boolean output = mybatlevel>minibatlevel;
        System.out.println(output+ "No need to charge your phone your current battery level is" +mybatlevel + "%");
    }
}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Ternary Oprator
class passorfail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks = sc.nextInt();
        String result = (marks>33)? "Pass":"Fail you have marks below 33";
        System.out.println(result);
    }
}
class shopoffer{
    // shop on mobile and get headphone free
    public static void main(String[]args){
        String item = "Phone";
        String offer = (item== "Phone")?"You got a earphone":"you got nothing thamks for shopping";
        System.out.println(offer);
    }
}
class fieldselector{
    public static void main(String[] args){
        // this tell which you field you got science or commerce
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage:");
        float percen = sc.nextInt();
        String field = (percen>95)?"You got science field":"You got commerce";
        System.out.println(field);
        
    }
}
//____________________________________________________________________END OF THE PROJECT___________________________________________________________________________________________________________
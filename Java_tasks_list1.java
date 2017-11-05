package java_tasks_list1;

public class Java_tasks_list1 {

    
    public static void main(String[] args) {
      
    //Task 1        
    
    //Operator- based on the value, the calculator will perform a specific task
    char operator = '/';
       
    //Variables, on which operations will be performed
    float calcA = 11;
    float calcB = 3;
       
    //The result
    float result;  //I use float on purpose to get a precise result
       
       
    //The calculator:
       
    switch (operator){
        case '+': 
            result = calcA + calcB;
            System.out.println("The result of adding " + calcA + " to " + calcB + " is " + result + ".");
            break;
                     
        case '-':
            result = calcA - calcB;
            System.out.println("The result of substracting " + calcB + " from " + calcA + " is " + result + ".");
            break;
                     
        case '*': 
            result = calcA * calcB;
            System.out.println("The result of multiplying " + calcA + " by " + calcB + " is " + result + ".");
            break; 
                     
        case '/':
            result = calcA / calcB;
            System.out.println("The result of dividing " + calcA + " by " + calcB + " is " + result + ".");
            break; 
                     
            default: System.out.println("You must initialize the operator variable!");
       }

    
    //Task 2
    System.out.println(" "); //To make reading the output easier

    //User age
    
    byte usrAge = 20;
    
    if (usrAge >= 0 && usrAge < 11) System.out.println("The user is a child.");
    else if (usrAge > 11 && usrAge < 18) System.out.println("The user is a teenager.");
    else if (usrAge > 18 && usrAge < 60) System.out.println("The user is an adult.");
    else if (usrAge > 60) System.out.println("The user is a senior.");
    else System.out.println("The value of usrAge is incorrect.");
    

   //Task3
    System.out.println(" "); 

    
    int A = 1997;
    double B = 3.14;
    char C = '+';
    boolean D = true;
    
    System.out.println("Zmienna A ma wartość " + A);
    System.out.println("Zmienna B ma wartość " + B);
    System.out.println("Zmienna C ma wartość " + C);
    System.out.println("Zmienna D ma wartość " + D);


    //Task 4
    System.out.println(" ");

    char checkMe = 'W';
    int type = String.valueOf(checkMe).codePointAt(0); //Conversion into ASCII

    
    System.out.println(type);
    
    if (type <= 57) System.out.println("It's a digit!");
    else if (type >= 65 && type <= 90) System.out.println("It's a capital letter!");
    else if (type >= 97 && type <= 122) System.out.println("It's a small letter!");
    else System.out.println("It's a special character!"); 


    //Task 5 - extra task
    System.out.println(" ");

    char check = 'W';
    int checkType = String.valueOf(check).codePointAt(0); //Conversion into ASCII
    String checkAsString = Character.toString(check);

    
  
    if (checkType <= 57) System.out.println("It's a digit!");
    else if (checkType >= 65 && checkType <= 90) System.out.println("It's a capital letter!" + " It's " + check + " and in lowercase it's " + checkAsString.toLowerCase());
    else if (checkType >= 97 && checkType <= 122) System.out.println("It's a small letter!" + " It's " + check + " and in uppercase it's " + checkAsString.toUpperCase());
    else System.out.println("It's a special character!");


   }
    
}

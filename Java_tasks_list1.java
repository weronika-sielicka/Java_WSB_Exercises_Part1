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

 
   }
    
}

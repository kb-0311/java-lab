import java.util.Scanner;

/**
 * calculator
 */
public class calculator {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
        Innercalculator operation = new Innercalculator(a , b);
        char c ;
        do {
            System.out.println("Enter the operation press q for exit the program or continue otherwise");
            System.out.println("+ , - , / , * , ^ , % ");

            c = ob.next().charAt(0);
            switch (c) {
                case '+':
                    System.out.println(operation.add());
                    break;
                
                case '-':
                    System.out.println(operation.subtract());
                    break;
                case '*':
                    System.out.println(operation.multiply());
                    break;  
                case '/':
                    System.out.println(operation.divide());
                    break;
                case '^':
                    System.out.println(operation.power());
                    break; 
                case '%':
                    System.out.println(operation.modulo());
                    break;       
            
                default:
                    c='q';
                    break;
            }


        } while(c!='q');

        ob.close();
    }
}

/**
 * Innercalculator
 */
class Innercalculator {

    int a ;
    int b ;
    Innercalculator(int a , int b){
        this.a = a;
        this.b = b;
    }
    public int  add() {
        return this.a+this.b;
    }
    public int  subtract() {
        return this.a-this.b;
    }
    public int  multiply() {
        return this.a*this.b;
    }
    public int  divide() {
        return this.a/this.b;
    }
    public long  power() {
        return (long)Math.pow(this.a , this.b);
    }
    public int  modulo() {
        return this.a%this.b;
    }
    
    
}
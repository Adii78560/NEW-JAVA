package ConditionsAndLoops;

public class multipleIfElse {
    public static void main(String[] args) {
        
        int salary=25000;
        if(salary>10000){
            salary+=2000;
            System.out.println("Incremented salary by 2000 = "+salary);
        }
        else if(salary>20000){
            salary+=4000;
            System.out.println("Incremented salary by 4000 = "+salary);
        }
        else{
            salary+=1000;
            System.out.println("Incremented salary by 1000 = "+salary);
        }

        // correct code!!!
        if (salary > 10000) {
            salary += 2000;
            System.out.println("Incremented salary by 2000 = " + salary);
        }
        
        if (salary > 20000) {
            salary += 4000;
            System.out.println("Incremented salary by 4000 = " + salary);
        }
        
        if (salary <= 20000) {
            salary += 1000;
            System.out.println("Incremented salary by 1000 = " + salary);
        }

    }
}

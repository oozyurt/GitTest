public class calculator {

    public static double add (double num1, double num2){
        Double result = num1+num2;
        return result;
    }

    public static double subtract (double num1, double num2){
        Double result= num1-num2;
        return result;
    }
    
      public static double multiply (double num1, double num2){
        Double result= num1*num2;
        return result;
    }
    
    

    public static void main(String[] args) {
        System.out.println(add(20,15));
        System.out.println(subtract(20,15));
    }


}

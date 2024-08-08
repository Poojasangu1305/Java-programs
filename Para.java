package program;



public class Para {

  
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
       
        Para para = new Para();
        
        
        int num1 = 5;
        int num2 = 10;
        
     
        int result = para.add(num1, num2);
        
        System.out.println(result);
    }
}

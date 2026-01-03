public class classdemo {
     public int add(int num1, int num2){
    int sum=num1+num2;
     return sum;
   }
   public static void main(String[] args) {
    classdemo obj=new classdemo();
    int result=obj.add(10,20);
    System.out.println("The sum is: "+result);
   }
    
}

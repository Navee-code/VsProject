class BinarySearch {
   public static void  main(String a[]){
      try {
         System.out.println(myPow(2, 3));
      } catch (Exception e) {
      
      }
      
   }
   public static double myPow(double x, int n) {
       // n=2;
       // x=2;
        return powerLoop(x,n);
   }
   public static double  power(double x,int n){
       if(n!=0){
            return (x * power(x, n - 1));       
       }else{
           return 1;
       }
   }
 
}
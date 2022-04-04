public class question3 {

 

        public static void main(String args[]) {
            
            int n1 = 7, n2 =  147, n3 = 735, lcm1, lcm2;

 

           
            lcm1 = (n1 > n2) ? n1 : n2;
            lcm2 = (n3>lcm1)? n3:lcm1;
            
            while(true) {
              if( lcm2 % n1 == 0 && lcm2 % n2 == 0 && lcm2%n3==0) {
                System.out.printf("##The LCM of %d, %d, and %d is : %d", n1, n2, n3, lcm2);
                break;
              }
              ++lcm2;
            }
    }
    
}

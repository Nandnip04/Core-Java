public class BasicPatternCondition {
    public static void main(String[] args) {
        
        //pattern-1
        //$$$$$
        //##### 
        //$$$$$
        //##### 
        //$$$$$

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i%2==0){
                    System.out.print("$");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        //$#$#$
        //$#$#$
        //$#$#$
        //$#$#$
        //$#$#$
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j%2==0){
                    System.out.print("$");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-3
        //12345
        //67891
        //23456
        //78912
        //34567
        
      
        //pattern-4
        //11111
        //12345
        //33333
        //12345
        //55555

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i%2==0){
                    System.out.print(j);
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-5
        //55555
        //54321
        //33333
        //54321
        //11111

        for(int i=5;i>=1;i--){
            for(int j=5;j>=1;j--){
                if(i%2==0){
                    System.out.print(j);
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

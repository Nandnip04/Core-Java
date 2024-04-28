public class BorderOnlyPatterns {
    public static void main(String[] args) {
        

        //pattenn-1
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                if(i==1 || i==7 || j==1|| i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i==7 || j==1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-3
        for(int i=7;i>=1;i--){
            for(int k=i;k<7;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==7|| j==1 ||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-4
        for(int i=1 ;i<=7;i++){
            for(int k=i;k<7;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==7|| j==1 || i==j){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class PyramidPatterns {
    public static void main(String[] args) {
        

        //pattern-1
        for(int i=1;i<=7;i++){
            for(int k=i;k<7;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        
        //pattern-2
        for(int i=1;i<=7;i++){
            for(int k=i;k<7;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(i==7|| j==1 || j==2*i-1){

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
        for(int i=1;i<=7;i++){
            for(int k=i;k<7;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-4
        for(int i=7;i>=1;i--){
            for(int k=i;k<7;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern-5
        for(int i=7;i>=1;i--){
            for(int k=i;k<7;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(i==7|| j==1|| j==2*i-1){

                    System.out.print("*");
                }else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-7
        for(int i=7;i>=1;i--){
            for(int k=i;k<7;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-8
        int r=6 ,c=1;
        for(int i=0;i<r;i++){
            for(int s=1;s<r-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0||i==0){
                    c=1;
                }
                else{
                    c=c*(i-j+1)/j;
                }
                System.out.print(" "+c);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-9
        for(int i=5;i>=1;i--){
            for(int s=5;s>i;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-10
        for(int i=1;i<=5;i++){
            for(int s=i;s<5;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();


        //pattern-11
        for(int i=1;i<=5;i++){
            for(int s=i;s<5;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-12
        for(int i=5;i>=1;i--){
            for(int s=i;s<5;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-13
        for(int i=1;i<=5;i++){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int s=i;s<5;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
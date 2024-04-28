public class starTrianglePattern {
    public static void main(String[] args) {
        

        //pattern-1
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern-3
        for(int i=1;i<=5;i++){
            for(int k=i;k>1;k--){
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern-4
        for(int i=1;i<=10;i++){
            if(i<=5){
                for(int j=1;j<=i;j++){
                 System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=i;j<=10;j++){
                 System.out.print("*");
                }
                 System.out.println();
            }
        }
        System.out.println();

        //pattern-5
        for(int i=1;i<=10;i++){
            if(i<=5){
                for(int k=i;k<5;k++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int k=i;k>6;k--){
                    System.out.print(" ");
                }
                for(int j=i;j<=10;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println();


         //pattern-6
         for(int i=1;i<10;i++){
            if(i<=5){
                for(int j=i;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=5;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println();

         //pattern-7
         for(int i=1;i<10;i++){
            if(i<=5){
                for(int k=1;k<=i;k++){
                    System.out.print(" ");
                }
                for(int j=i;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int k=i;k<10;k++){
                    System.out.print(" ");
                }
                for(int j=5;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println();

    }
}

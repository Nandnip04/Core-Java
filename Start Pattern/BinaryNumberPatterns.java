public class BinaryNumberPatterns {
    public static void main(String[] args) {
        
        //pattern-1
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n++%2);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        int m=1;
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(m++%2);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-3
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j%2);
            }
            System.out.println();
        }
        System.out.println();

          //pattern-4
          for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i%2);
            }
            System.out.println();
        }
        System.out.println();

          //pattern-5
          for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i%2);
            }
            System.out.println();
        }
        System.out.println();


    }
}

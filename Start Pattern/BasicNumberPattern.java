public class BasicNumberPattern{
    public static void main(String[] args) {
        //pattern-1 
        //12345
        //12345
        //12345
        //12345
        //12345

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        //11111
        //22222
        //33333
        //44444
        //55555

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-3
        //***** 
        //***** 
        //***** 
        //***** 
        //***** 
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        //pattern-4
        //54321
        //54321
        //54321
        //54321
        //54321

        for(int i=1;i<5;i++){
            for(int j=5;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

    //pattern-5
    //55555
    //44444
    //33333
    //22222
    //11111

    for(int i=5;i>=1;i--){
        for(int j=1;j<=5;j++){
            System.out.print(i);
        }
        System.out.println();
    }
    System.out.println();

    //pattern-6
    //10101
    //10101
    //10101
    //10101
    //10101
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
          System.out.print(j%2);
        }
        System.out.println();
    }
    System.out.println();


    //pattern-6
    //11111
    //00000
    //11111
    //00000
    //11111

    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print(i%2);
        }
        System.out.println();
    }
    System.out.println();
}

}
public class PlusCrossSwastika {
    public static void main(String[] args) {
        
        //pattern-1
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==0 || i==6 || j==0 || j==6){
                    System.out.print("+");
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
            for(int j=1;j<=7;j++){
                if(j==4 || i==4){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-4
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1||i==7|| i==4 || j==1|| j==4||j==7 ){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-5
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==j){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-6
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i+j==8){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-7
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==j || i+j==8){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        

        //pattern-8
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==j || i+j==8 ||i==1 ||i==7 ||j==1|| j==7){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-9
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((i==1 && j<4 ) || (i==7 && j>4)|| j==4){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();


         //pattern-10
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((j==7 && i<4 ) || (j==1 && i>4)|| i==4){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

         //pattern-11
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((i==1 && j<4)||(i==7 && j>4)||(j==7 && i<4)||(j==1 && i>4)|| i==4 || j==4){
                    System.out.print("+");
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

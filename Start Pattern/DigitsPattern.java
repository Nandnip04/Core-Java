public class DigitsPattern {
    public static void main(String [] args){

        // zero pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || j==1 || i==7 || j==7){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //one pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==4 || i==7 || (i<4 && i+j==5)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

         //two pattern
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i==4 || i==7 || (j==7 && i<4) || (j==1 && i>4)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

         //three pattern
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i==4 || i==7 ||j==7){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

         //four pattern
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==5 || i==5 || (i<6 && i+j==6)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

         //five pattern
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i==4 || i==7 || (j==1 && i<5) || (j==7 && i>4)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //six pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || j==1 || i==7 || i==4 || (j==7 && i>4)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

         //seven pattern
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i+j==8){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();


         //eight pattern
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i==7 || i==4 || j==1 || j==7){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

         //nine pattern
         for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i==7|| i==4 || j==7 || (j==1 && i<5) ){
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

public class AlphabetsPattern{
    public static void main(String[] args) {
        
        // A -pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j==6-i || (i==3 && j>2 && j<=7) || j==4+i)
                {
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //B- Pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || (i==1 && j<7)|| (i==7 && j<7)||(i==4 && j<6) || (j==7 && i>4 && i<7)||(j==7 && i>1 && i<4)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //c pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((j==1 && i<7)||(i==1 && j<7)|| (i==7 && j>1)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //D -patter
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1||(i==1 && j<7)|| (i==7 && j<7)||(j==7 && i>1 && i<7)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //E-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i==4 || i==7|| j==1){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //F- pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || i==1 || i==4){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //G- pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || i==7 || i==1 || (j==7 && i>3)|| (i==4 && i+j==10)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //H-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || j==7 || i==4){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //I-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i==7 || j==4){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //J-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || j==4 || (i==j+3)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //k-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || j==6-i|| i==j+2){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //L-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || i==7){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //M-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || j==7 || (i<5 && i==j)|| (i<5 && i+j==8)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //N-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || j==7 || i==j){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //O-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((i==1 && j>1 && j<7)|| (i==7 && j>1 && j<7)|| (j==1 && i>1 && i<7)|| (j==7 && i>1 && i<7)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //P-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || (i==4 && j<7) ||(i==1 && j<7)|| (j==7 && i>1 && i<4)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Q pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((i==1 && j>1 && j<7) || (j==1 && i>1 && i<5) || (j==7 && i>1 && i<5) || (i==5 && j>1 && j<7) || (j==4 && i>5) || (i==7 && j>4 && j<7)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //R-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((j==1 && i>1) || (i==1 && j>1 && j<7) || (j==7 && i>1 && i<4) || (i==4 && j>1 && j<7) || (i>4 && i==j)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //S-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((i==1 && j>1 && j<7) || (i==7 && j>1 && j<7) || (j==1 && i>1 && i<4) || (j==7 && i>4 && i<7) || (i==4 && j>1 && j<7)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //T-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || j==4){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //U -pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((j==1 && i<7) || (j==7 && i<7) || (i==7 && j>1 && j<7)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //V -pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==j+3 || (i>3 && i+j==11)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //W-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || j==7 || (i>3 && i+j==8) || (i>3 && i==j)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //X-pattern
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

        //Y-pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((i>3 && j==4) || (i<4 && i==j) || (i<4 && i+j==8)){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Z -pattern
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==1 || i==7 || i+j==8){
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
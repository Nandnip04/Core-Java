public class CharactersTrianglePattern {
    public static void main(String[] args) {
        
        //pattern-1
        for(char i='A';i<='E';i++){
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        for(char i='A';i<='E';i++){
            for(char j=i;j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-3
        for(char i='E';i>='A';i--){
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-4
        for(char i='A';i<='E';i++){
            for(char j=i;j<='E';j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-5
        for(char i='E';i>='A';i--){
            for(char j='E';j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-6
        for(char i='E';i>='A';i--){
            for(char j=i;j<='E';j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-7
        for(char i='A';i<='E';i++){
            for(char j='E';j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-9
        for(char i='E';i>='A';i--){
            for(char j=i;j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
}

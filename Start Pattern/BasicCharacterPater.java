public class BasicCharacterPater {
    public static void main(String [] args){

        //pattern-1
        //AAAAA
        //BBBBB
        //CCCCC
        //DDDDD
        //EEEEE

        for(char i='A';i<='E';i++){
            for(char j='A';j<='E';j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        //ABCDE
        //ABCDE
        //ABCDE
        //ABCDE
        //ABCDE

        for(char i='A';i<='E';i++){
            for(char j='A';j<='E';j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-3
        //EEEEE
        //DDDDD
        //CCCCC
        //BBBBB
        //AAAAA

        for(char i='E';i>='A';i--){
            for(char j='E';j>='A';j--){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-4
        //EDCBA
        //EDCBA
        //EDCBA
        //EDCBA
        //EDCBA

        for(char i='E';i>='A';i--){
            for(char j='E';j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

    }
}

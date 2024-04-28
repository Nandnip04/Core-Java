public class NumbersTrianglePatter {
    public static void main(String[] args) {

        // pattern-1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-2
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-3
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-4
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-5
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-6
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-7
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-8
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-9
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-10
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-10
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-11
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++);
                if (k > 9) {
                    k = 1;
                }
            }
            System.out.println();
        }
        System.out.println();

        // pattern-12
        int n = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n++);
                if (n > 9) {
                    n = 1;
                }
            }
            System.out.println();
        }
        System.out.println();

        // pattern -13
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int m = i; m >= 1; m--) {
                System.out.print(m);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-14
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= i; p++) {
                System.out.print(p);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-15
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int p = i; p <= 5; p++) {
                System.out.print(p);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-16
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int p = i; p <= 5; p++) {
                System.out.print(p);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-16
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int p = 5; p >= i; p--) {
                System.out.print(p);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-17
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int p = i; p >= 1; p--) {
                System.out.print(p);
            }
            System.out.println();
        }
        System.out.println();

        // pattern-18
        for(int i=1;i<=5;i++){
            for(int j=i;j>1;j--){
                System.out.print(" ");
            }
            for(int p=5;p>=i;p--){
                System.out.print(p);
            }
            System.out.println();
        }
        System.out.println();

    }
}

import java.lang.reflect.Array;

public class Looping {
    public static void main(String[] args) {
//        sample01(11);
        sample03(11);
    }

    public static void sample01(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void sample02(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("Fizz\t");
            } else {
                System.out.print(i+"\t");
            }
        }
    }

    public static void sample03(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+i+","+j+"]\t");
            }
            System.out.println();
        }
    }

    public static void sample04() {
//        List<String> listString = Array.asList("Coding", "Reading", "Sport");
//        System.out.println("List of Hobby");
//        for (String item: listString) {
//            System.out.println(item + "\t");
//        }
    }
}

public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            char x = args[i].charAt(0);
            if((int)x % 5 == 0) {
                System.out.println(x);
            }
        }
    }
}

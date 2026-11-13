public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        if (args.length == 0) {
            System.out.println("Please provide the length of the series as an argument.");
            return;
        }

        int length = Integer.parseInt(args[0]);

        for (int i = 0; i < length; i++) {
            if (i%2 == 0) {
                approxPi += (1.0 / (2 * i + 1));
            } else {
                approxPi -= (1.0 / (2 * i + 1));
            }
        }

        approxPi *= 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}

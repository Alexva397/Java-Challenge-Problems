public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(20.00);
    }
    public static long toMilesPerHour(double kph) {
        if (kph < 0 ) {
            return -1;
        } else {
            long finalMph = Math.round(kph / 1.609);
            return finalMph;
        }
    }
    public static void printConversion(double kph) {
        if (kph < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kph + " km/h = " + toMilesPerHour(kph) + " mi/h");
        }
    }
}

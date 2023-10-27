package Learning;

public class ComputeAverageSpeed {
    public static void main(String[] args) {

//        Define the distance in kilometers
        double distanceKm = 15.0;

        double distanceMiles = distanceKm / 1.6;

//        define the time in minutes and seconds
        int minutes = 50;
        int seconds = 30;

//        convert to hours
        double timeHours = (minutes + seconds / 60.0) / 60.0;

//        Calculate the average speed in miles per hour
        double averageSpeedMph = distanceMiles / timeHours;


        System.out.printf("Average speed: %.2f miles per hour%n", averageSpeedMph);

    }
}

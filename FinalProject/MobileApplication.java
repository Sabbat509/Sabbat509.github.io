import java.io.IOException;
import java.util.Scanner;

public class MobileApplication {
    private SearchEngineService searchEngine;

    public MobileApplication(SearchEngineService searchEngine) {
        this.searchEngine = searchEngine;
    }

    public void runMobileApp() {
        // Get user input for city and restaurant type
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city: ");
        String city = scanner.nextLine();

        System.out.println("Enter the type of restaurant: ");
        String restaurantType = scanner.nextLine();

        // Attempt to build the search database with the external keyword
        try {
            searchEngine.buildSearchDatabase(restaurantType);

            // Perform search based on user input
            searchEngine.search(city);

            // Publish the results online
            searchEngine.publishResultsOnline();

        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred while processing the search database: " + e.getMessage());
        } finally {
            // Close the scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }


}

public class Main {
    public static void main(String[] args) throws IOException {
        // Specify search URLs (e.g., google.com and duckduckgo.com)
        List<String> searchUrls = List.of("https://www.google.com", "https://duckduckgo.com");

        // Create a SearchEngineService instance
        SearchEngineService searchEngineService = new SearchEngineService(searchUrls);

        // Build the search database with an external keyword
        searchEngineService.buildSearchDatabase("restaurants");

        // Perform a search using the mobile application
        MobileApplication mobileApp = new MobileApplication(searchEngineService);
        mobileApp.runMobileApp();
    }
}

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchDatabase {
    private List<String> searchUrls;
    private Map<String, Integer> keywordCounts;

    public SearchDatabase(List<String> searchUrls) {
        this.searchUrls = searchUrls;
        this.keywordCounts = new HashMap<>();
    }

    public void countKeywords(String externalKeyword) throws IOException {
        // Implement keyword counting based on externalKeyword and searchUrls
    }

    public Map<String, Integer> getKeywordCounts() {
        return keywordCounts;
    }
}

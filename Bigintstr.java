import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of items
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Dictionary to store items and their prices
        Map<String, Double> items = new HashMap<>();
        
        // Read the items and their prices
        for (int i = 0; i < n; i++) {
            String itemName = scanner.next();
            double price = scanner.nextDouble();
            items.put(itemName, price);
        }
        
        // Find the item with the highest price
        String maxItem = "";
        double maxPrice = Double.MIN_VALUE;
        
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            if (entry.getValue() > maxPrice) {
                maxPrice = entry.getValue();
                maxItem = entry.getKey();
            }
        }
        
        // Output the item with the highest price
        System.out.println(maxItem + " " + maxPrice);
    }
}

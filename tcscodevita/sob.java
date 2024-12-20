package tcscodevita;
import java.util.*;
public class sob {
  
        // Recursive function with memoization
        public static int dp(String s, List<String> substrings, Map<String, Integer> memo) {
            if (memo.containsKey(s)) return memo.get(s);
    
            int placementlelo = 0;
    
            // Iterate through substrings
            for (String sub : substrings) {
                int pos = s.indexOf(sub);
                if (pos != -1) {
                    String newString = s.substring(0, pos) + s.substring(pos + sub.length());
                    placementlelo = Math.max(placementlelo, 1 + dp(newString, substrings, memo));
                }
            }
    
            memo.put(s, placementlelo);
            return placementlelo;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Read the number of substrings
            int n = Integer.parseInt(scanner.nextLine().trim());
    
            // Read substrings into a list
            List<String> substrings = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                substrings.add(scanner.next());
            }
            scanner.nextLine(); // Consume the newline character
    
            // Read the main string
            String mainString = scanner.nextLine().trim();
    
            // Initialize memoization map
            Map<String, Integer> memo = new HashMap<>();
    
            // Compute and print the result
            System.out.println(dp(mainString, substrings, memo));
    
            scanner.close();
        }
    
      
}

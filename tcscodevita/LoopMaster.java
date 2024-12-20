package tcscodevita;
import java.util.*;

public class LoopMaster {

    // Method to process commands
    public static List<String> processCommands(List<String> commands) {
        Stack<Map<String, Integer>> loopStack = new Stack<>();
        List<String> result = new ArrayList<>();

        for (String command : commands) {
            String[] parts = command.split(" ");
            String commandType = parts[0];

            // Handling "for" loop command
            if (commandType.equals("for")) {
                int loopCount = Integer.parseInt(parts[2].replace("times", ""));
                Map<String, Integer> loopState = new HashMap<>();
                loopState.put("iterations", loopCount);
                loopState.put("current", 0);
                loopStack.push(loopState);
            } 
            // Handling "do" command (marks the start of the loop body)
            else if (commandType.equals("do")) {
                // Nothing special to do here
            } 
            // Handling "done" command (marks the end of the loop)
            else if (commandType.equals("done")) {
                loopStack.pop();  // End the current loop and remove it from the stack
            } 
            // Handling "break" command (exit loop on certain iteration)
            else if (commandType.equals("break")) {
                int breakAt = Integer.parseInt(parts[1]);
                if (loopStack.peek().get("current") + 1 == breakAt) {
                    loopStack.pop();  // Break the loop
                }
            }
            // Handling "continue" command (skip current iteration)
            else if (commandType.equals("continue")) {
                int continueAt = Integer.parseInt(parts[1]);
                if (loopStack.peek().get("current") + 1 == continueAt) {
                    loopStack.peek().put("current", loopStack.peek().get("current") + 1);  // Skip the current iteration
                    continue;  // Skip the rest of the loop body
                }
            }
            // Handling "print" command (print the statement)
            else if (commandType.equals("print")) {
                String statement = String.join(" ", Arrays.copyOfRange(parts, 1, parts.length));
                result.add(statement.trim().replaceAll("\"", ""));  // Remove the quotes
            }

            // Increment the current iteration for the active loop
            if (!loopStack.isEmpty()) {
                Map<String, Integer> currentLoop = loopStack.peek();
                if (currentLoop.get("current") < currentLoop.get("iterations")) {
                    currentLoop.put("current", currentLoop.get("current") + 1);
                } else {
                    loopStack.pop();  // If max iterations reached, exit the loop
                }
            }
        }

        return result;  // Return the list of output statements
    }

    public static void main(String[] args) {
        // Example usage
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<String> commands = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            commands.add(scanner.nextLine().trim());
        }
        List<String> output = processCommands(commands);
        for (String line : output) {
            System.out.println(line);  // Print the result
        }
        scanner.close();
    }
}

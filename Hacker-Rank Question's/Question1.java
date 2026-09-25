import java.util.Scanner; // Import Scanner class to read user input from keyboard (System.in)

public class Question1 { // Main class - entry point of the Java program

    /**
     * Checks if two strings are anagrams of each other.
     * An anagram is a word/phrase formed by rearranging the letters of another.
     * Example: "listen" & "silent" are anagrams.
     * 
     * IMPROVEMENTS IN THIS VERSION:
     * 1. Case insensitivity - converts both strings to lowercase
     * 2. Handles spaces - removes all whitespace characters
     * 3. Input validation - checks for null/empty strings
     * 4. Handles non-alphabetic characters - ignores them (only counts a-z)
     * 5. Fixed typo in prompt message
     * 
     * @param a First input string
     * @param b Second input string
     * @return true if anagrams, false otherwise
     */
    public static boolean isAnagram(String a, String b) {
        
        // ===== IMPROVEMENT 3: INPUT VALIDATION =====
        // Check if either string is null (not initialized)
        if (a == null || b == null) {
            return false; // Null strings cannot be anagrams
        }
        
        // ===== IMPROVEMENT 1 & 2: NORMALIZE STRINGS =====
        // Convert to lowercase for case insensitivity
        // Remove all whitespace (spaces, tabs, newlines) using regex \\s+
        // This allows phrases like "Astronomer" and "Moon starer" to work
        String normalizedA = a.toLowerCase().replaceAll("\\s+", "");
        String normalizedB = b.toLowerCase().replaceAll("\\s+", "");
        
        // Check if normalized strings are empty (e.g., input was only spaces)
        if (normalizedA.isEmpty() || normalizedB.isEmpty()) {
            return false; // Empty strings after normalization = not valid anagrams
        }

        // ===== ORIGINAL LOGIC: LENGTH CHECK =====
        // Quick optimization: different lengths = cannot be anagrams
        // We check AFTER normalization because spaces are removed
        if (normalizedA.length() != normalizedB.length()) {
            return false;
        }

        // Frequency array for 26 lowercase letters (a-z)
        // Index mapping: 'a'->0, 'b'->1, ..., 'z'->25
        int[] frequency = new int[26];

        // ===== FIRST LOOP: COUNT CHARACTERS IN STRING A =====
        // Enhanced to ignore non-alphabetic characters (IMPROVEMENT 4)
        for (int i = 0; i < normalizedA.length(); i++) {
            char ch = normalizedA.charAt(i); // Get character at position i
            
            // Only process lowercase letters a-z (ASCII 97-122)
            // Ignore numbers, punctuation, special characters
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; // Convert char to array index (0-25)
                frequency[index]++;   // Increment count for this letter
            }
            // Non-alphabetic characters are silently ignored
        }
        
        // ===== SECOND LOOP: SUBTRACT CHARACTERS IN STRING B =====
        // Same logic - only process a-z characters
        for (int i = 0; i < normalizedB.length(); i++) {
            char ch = normalizedB.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                frequency[index]--;   // Decrement count for this letter
            }
        }

        // ===== THIRD LOOP: VERIFY ALL COUNTS ARE ZERO =====
        // If strings are anagrams, every increment has a matching decrement
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                return false; // Mismatch found - not anagrams
            }
        }
        return true; // All counts zero - strings are anagrams!
    }

    public static void main(String[] args) {
        // Create Scanner to read from standard input (keyboard)
        Scanner sc = new Scanner(System.in);
        
        // ===== IMPROVEMENT 5: FIXED TYPO =====
        // "Secound" -> "Second" (and "number" -> "word" for clarity)
        System.out.println("Enter first word");
        // Use nextLine() instead of next() to capture full phrases with spaces
        // Example: "Astronomer" or "Moon starer" (with space)
        String a = sc.nextLine();
        
        System.out.println("Enter second word");
        String b = sc.nextLine();

        // Call the improved isAnagram method
        boolean ret = isAnagram(a, b);
        
        // Print result using ternary operator
        // If true: "is anagram", if false: "not an anagram" (fixed grammar)
        System.out.println((ret) ? "is anagram" : "not an anagram");
        
        // Close scanner to prevent resource leak (good practice)
        sc.close();
    }

}

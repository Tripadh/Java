public class String1 {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        
        // Length of the string
        System.out.println("Length: " + str.length());
        
        // Character at index 7
        System.out.println("Character at index 7: " + str.charAt(7));
        
        // Substring from index 7 to 12
        System.out.println("Substring (7-12): " + str.substring(7, 12));
        
        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // Replace 'World' with 'Java'
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
    }
}

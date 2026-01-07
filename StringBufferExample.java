public class StringBufferExample 
{
    public static void main(String[] args) 
    {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string to the StringBuffer
        sb.append(" World");

        // Insert a string at a specific index
        sb.insert(5, ",");

        // Replace a portion of the StringBuffer
        sb.replace(7, 12, "Java");

        // Delete a portion of the StringBuffer
        sb.delete(5, 6);

        // Reverse the StringBuffer
        sb.reverse();

        // Print the final content of the StringBuffer
        System.out.println(sb.toString());
    }
}

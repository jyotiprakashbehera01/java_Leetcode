public class defineipaddress {
    
    // Function to defang the IP address
    public static String defangIPaddr(String address) {
        // Replace every "." with "[.]"
        return address.replace(".", "[.]");
    }

    // Main function to test the method
    public static void main(String[] args) {
        // Test cases
        String ip1 = "1.1.1.1";
        String ip2 = "255.100.50.0";

        // Printing results
        System.out.println("Input: " + ip1);
        System.out.println("Output: " + defangIPaddr(ip1));
        System.out.println();

        System.out.println("Input: " + ip2);
        System.out.println("Output: " + defangIPaddr(ip2));
    }
}

    // Msg.java
    import java.util.Random;

public class msg {



    public static void main(String[] args) {

        // Array of possible messages
        String[] messages = {
            "Hello, World!",
            "Java is fun.",
            "Keep learning.",
            "Coding is cool!",
            "Have a great day."
        };

        // Create a Random object
        Random random = new Random();

        // Get a random index from 0 to the length of the array - 1
        int randomIndex = random.nextInt(messages.length);

        // Print a random message from the array
        System.out.println(messages[randomIndex]);
    
}
}

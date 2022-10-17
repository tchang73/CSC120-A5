/*
 * Prints banner with message using ASCII art
 * @param string to receive message
 * @return ASCII art that prints out banner, which resizes based on the message provided
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Prints a decorative banner, resized to fit the message
     */
    public void display() {
        String message = "**~~ " + this.message + " ~~**"; //create message
        for (int i=0; i< message.length(); i++){ //print out "~" according to how long the message is
            System.out.print("~");
        }        
        System.out.println("");
        System.out.println("**~~ " + this.message + " ~~**"); //print message
        for (int i=0; i< message.length(); i++){ //print out "~" according to how long the message is
            System.out.print("~");
        }
        System.out.println("");
    }
}

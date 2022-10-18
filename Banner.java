/*
 * Prints banner with message using ASCII art
 * @param string to receive message
 * @return ASCII art that prints out banner, which resizes based on the message provided
 */
public class Banner {
    
    /* String to store message */
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
        if (message.length()%2 == 0){
        for (int i=0; i< message.length(); i++){ //print banner decors
            System.out.print("~");
        }
        System.out.println("");
        for (int i=0; i<message.length()/4; i++){
            System.out.print(" *  ");
        }       
        System.out.println("");
        System.out.println("**~~ " + this.message + " ~~**"); //print message
        for (int i=0; i<message.length()/4; i++){//print banner decors
            System.out.print(" *  ");
        } 
        System.out.println("");
        for (int i=0; i< message.length(); i++){ 
            System.out.print("~");
        }
    } else {for (int i=0; i< message.length(); i++){ //print banner decors
        System.out.print("~");
    }
    System.out.println("");
    for (int i=0; i<message.length()/3; i++){
        System.out.print("* *");
    }       
    System.out.println("");
    System.out.println("**~~ " + this.message + " ~~**"); //print message
    for (int i=0; i<message.length()/3; i++){//print banner decors
        System.out.print("* *");
    } 
    System.out.println("");
    for (int i=0; i< message.length(); i++){ 
       }
        System.out.print("");
        System.out.println("    *****");
        System.out.println("      ***");
        System.out.println("       **");


    }
  }
}
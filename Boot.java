/*
 * Prints left and right boots using ASCII art
 * @param String stores direction of boots
 * @return left and right boots 
 */
public class Boot {
  /* String to store direction */
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * print ASCII Art left and right Boots
     */
    public void display() {
      String leftBoot = "|_______|";
      String rightBoot = "          |_______|";
        if (this.direction.equals("left")) {
          System.out.print(leftBoot);
        } else if (this.direction.equals("right")) {
          System.out.print(rightBoot);
        }
        else {
          System.out.println("Which boot?");
        }
    }
}

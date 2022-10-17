/*
 * Scarecrow class
 * @author Tina Chang and Tseegi Nyamdorj
 * @version 16 October 2022
 * @param Banner, Pumpkin, Shirt, Pants, Boot, Boot, String
 * @return a decorative banner with message, pumpkin head, shirt, pants, and boots created in their respective classes using ASCII art
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * implement each class
     */
    private Banner sign;
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private String message;

    /* Constructor
     * initialize all parts of the scarecrow
     */
    public Scarecrow(Banner banner, String string, Pumpkin pumpkin, Shirt shirt, Pants pants, Boot lf, Boot rf) {
        sign = banner;
        message = string;
        head = pumpkin;
        body = shirt;
        legs = pants;
        leftFoot = lf;
        rightFoot = rf;
    }


    /* Displays the Scarecrow 
    * calls the .display() method of each part 
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }
    

    /* Main method
    * Displays final scarecrow
    */
    public static void main(String[] args) {
        //create new Scarecrow with banner, string, pumpkin, shirt, pants, boots
        Scarecrow myScarecrow = new Scarecrow(new Banner(""), new String(), new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right")); 

        if (args.length > 0) { //print out message with banner if one is provided
            myScarecrow.sign = new Banner(args[0]);
        } else { // print out default message if no message was provided
            myScarecrow.sign = new Banner("It's fall!!");
        };

        //display scarecrow
        myScarecrow.display();

    }

}

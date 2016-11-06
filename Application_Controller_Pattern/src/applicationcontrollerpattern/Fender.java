package applicationcontrollerpattern;


public class Fender implements GuitarHandler {

    @Override
    public void execute() {
        System.out.println("Fender, is an American manufacturer of stringed instruments and amplifiers. \n"
                + "It is known for its solid-body electric guitars and bass guitars, such as the Stratocaster, Telecaster, \n"
                + "Precision Bass, and the Jazz Bass. Its headquarters are in Scottsdale, Arizona. \n"
                + "The company, previously named the Fender Electric Instrument Manufacturing Company, \n"
                + "was founded in Fullerton, California, by Clarence Leonidas \"Leo\" Fender in 1946.");
    }
    
}

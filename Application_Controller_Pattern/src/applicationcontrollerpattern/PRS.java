package applicationcontrollerpattern;


public class PRS implements GuitarHandler {

    @Override
    public void execute() {
        System.out.println("PRS Guitars (also known as Paul Reed Smith Guitars) \nis an American guitar manufacturer headquartered"
                + " in Stevensville, Maryland, founded by guitarist and master luthier Paul Reed Smith in 1985.\n" 
                + "PRS has a reputation as a manufacturer of high end electric guitars made in the US, and they are known for their custom shop instruments.");
    }
    
}

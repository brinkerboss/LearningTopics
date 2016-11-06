/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern;

/**
 *
 * @author brinkerboss
 */
public class Rickenbacker implements GuitarHandler{

    @Override
    public void execute() {
        System.out.println("is an electric string instrument manufacturer based in Santa Ana, California. \n"
                + "In 1932, the company became the world's first to produce electric guitars and eventually \n"
                + "produced a range of electric guitars and bass guitars.");
    }
    
}

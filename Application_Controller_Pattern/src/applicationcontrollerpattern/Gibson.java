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
public class Gibson implements GuitarHandler{
    

    @Override
    public void execute() {
       System.out.println("Gibson Brands, Inc. is an American manufacturer of guitars and other instruments, now based in Nashville, Tennessee. \n"
            + "The company was formerly known as Gibson Guitar Corp. and renamed Gibson Brands, Inc. on June 11, 2013.\n");
    }
}

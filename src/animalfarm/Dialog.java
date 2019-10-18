/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package animalfarm;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author thor
 */
public class Dialog {
	Scanner myScanner;

	public void greeting() {
		System.out.println("hi");
	}

	public String getName() {
		System.out.println("What is the name?");
		return myScanner.nextLine();
	}

	
}

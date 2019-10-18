/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalfarm;

import java.util.Scanner;

/**
 *
 * @author thor
 */
public class CatEntryDialog extends Dialog{
	Scanner myScanner;

	public CatEntryDialog() {
		myScanner = new Scanner(System.in);
	}

	@Override
	public void greeting() {
		System.out.println("Welcom to the Cat menue");
	}
}

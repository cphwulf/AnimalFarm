/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalfarm;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class FarmAssistantTest {
		FarmAssistant assistant;
	
	public FarmAssistantTest() {
	}
	
	@Before
	public void setUp() {
		assistant = new FarmAssistant("Kurt");
	}

	/**
	 * Test of addAnimalDialog method, of class FarmAssistant.
	 */
	@Test
	public void testAddAnimalDialog() {
		System.out.println("addAnimalDialog");
		assistant.addAnimalDialog();
		assertTrue(true);
	}
	
}

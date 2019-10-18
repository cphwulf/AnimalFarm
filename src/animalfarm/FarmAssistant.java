package animalfarm;

import java.util.Scanner;

public class FarmAssistant extends Employee {

    private Animal myAnimal;
    private DialogFactory dialogFactory;

    public FarmAssistant(String name) {
	    super(name);
    }


    public void addAnimalDialog() {
     this.dialogFactory = new DialogFactory();
	    Scanner myScanner = new Scanner(System.in);
	    System.out.println("What type of animal? (Dog,Horse,Cat)?");
	    String answer = myScanner.nextLine();
	    Dialog myDiag = dialogFactory.makeNewDialog(answer);
	    myDiag.greeting();
    }
}

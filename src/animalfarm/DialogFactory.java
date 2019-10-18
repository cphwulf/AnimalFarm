package animalfarm;

/**
 *
 * @author thor
 */
public class DialogFactory {

	public Dialog makeNewDialog(String typeOfDialog){
		Dialog newDialog = null;

		if (typeOfDialog.equals("New Cat")) {
			return new CatEntryDialog();
		} else 
		if (typeOfDialog.equals("New Dog")) {
			return new DogEntryDialog();
		}
		if (typeOfDialog.equals("New Horse")) {
			return new DogEntryDialog();
		} else return null;
	}
}

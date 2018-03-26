package menuClasses;

import java.util.ArrayList;

public class AlterListContentMenu extends Menu{
	
	private static AlterListContentMenu OLM = new AlterListContentMenu(); 
	private AlterListContentMenu() { 
		super(); 
		String title; 
		ArrayList<Option> options = new ArrayList<Option>();  
		title = "Alter Lists Menu"; 
		options.add(new Option("Add a New Value Lists", new AddToListAction())); 
		options.add(new Option("Delete a position from a List", new DeleteFromListAction())); 
		options.add(new Option("Show content of a List", new ShowListAction())); 
		options.add(new Option("Exit", new ExitAction()));
		options.add(Option.EXIT); 

		super.InitializeMenu(title, options); 

	}
	
	public static AlterListContentMenu getOperateListsMenu() { 
		return OLM; 
	}

}

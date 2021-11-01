package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Damian LaRo cque
 */
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AppController {
    @FXML
    Button addItem;

    @FXML
    TextField descriptionText;

    @FXML
    DatePicker datePicker;

    @FXML
    ListView<Item> itemList;

    @FXML


    public void createList() {
        //If user clicks 'Create list'
        //Read list title from GUI
        //Create instance of toDoList
        //Store title in toDoList object
        //Add toDoList object to ArrayList<toDoList> appLists in main
    }

    public void removeList() {
        //Take title String of list to be removed
        // Look through ArrayList<toDoList> appLists to find list matching title
        //Delete element (toDoList object)
    }

    public void editListTitle() {
        //Read new title from GUI
        //Read old title from GUI
        //Look through appLists to find element matching old title
        //Replace toDoList.Title with new title
    }

    public void addItem(Item i){
        //Read Item name, due date and description from GUI
        //Use item setters to add each field and create Item, object
        //Add Item to appropriate toDoList in appLists
    }
    public void editItem() {
        //Read new item name, descr, and/or due date
        //read old item name and list containing item from GUI (based on user selection)
        //Select item object from toDoList object
        //edit Item name, descr, and or/due date using setter methods
    }

    public void removeItem() {
        //Read item name to be deleted and name of list containing item from GUI
        //Open list and find item object
        //Delete item from array list
    }

    public void editDueDate() {
        //Read item due date from gui
        //Read item name and toDoList containing item from GUI
        //Loop through appLists to find the toDoList
        //Loop through the to do list to find the item by title match
        //use Item setter method to change due date
    }
    public void markComplete() {
        //read item being marked as complete by user from GUI
        //use item title and containing list title to locate item
        //Set item bool Complete data field to true
    }

    public void sortByComplete() {
        //Loop through all items in toDoList object
        //if Item.Complete == true, display item
        //else don't display item
    }
    public void sortByIncomplete() {
        //Loop through all items in toDoList object
        //if Item.Complete == false, display item
        //else don't display item
    }

    public void saveAllItemToExtern() {
        //Read toDoList to be saved from GUI
        //Convert all data in toDoList to csv format
        //Use FioleIO to write converted data to CSV
    }
    public void saveAllListsToExtern() {
        //Loop through every toDoList in appLists and convert all data in each toDoList to csv format
        //Use FioleIO to write converted data to CSV
    }
    public void loadSingleList() {
        //Read List title to load from GUI
        //Parse through CSV file until title match for list found
        //Convert data from CSV to objects
        //Display objects
    }
    public void loadMultipleList() {
        //Parse through CSV file and convert all data from CSV to objects
        //Display objects
    }
}
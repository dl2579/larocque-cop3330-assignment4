package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppControllerTest {

    @Test
    void createList() {
        //Create dummy list
        //Check that appLists now contains dummy list
    }

    @Test
    void removeList() {
        //Create dummy list
        //Check that appLists now contains dummy list
        //RemoveList(dummy list)
        //Check that appLists no longer contains dummy list
    }

    @Test
    void editListTitle() {
        //Create dummy list
        //editListTitle()
        //Check that appLists no longer contains old list title
        //Check that appLists now contains list matching new title
    }

    @Test
    void addItem() {
        //Create dummy item with addItem() and add to a toDoList
        //Check toDoList for an item that matches item name, due date and description
    }

    @Test
    void editItem() {
        //Create dummy item with addItem() and add to a toDoList
        //editItem()
        //Now check that old item name and descr no longer exists
        //Check that item containing new item name and descr exists
    }

    @Test
    void removeItem() {
        //Create dummy item with addItem() and add to a toDoList
        //removeItem()
        //Check that item name no longer exists within toDoList
    }

    @Test
    void editDueDate() {
        //Create dummy item with addItem() and add to a toDoList
        //editDueDate()
        //Check that item due date now matches new due date
    }

    @Test
    void markComplete() {
        //Create dummy item with Complete field initialized to false
        //markComplete()
        //Check item.Complete == true
    }

    @Test
    void sortByComplete() {
        //Create dummy items with mix of some complete some marked as incomplete
        //sortByComplete()
        //Check that list returned by sortByComplete() matches all the items we set to complete and that every item in list has Item.Complete == true
    }

    @Test
    void sortByIncomplete() {
        //Create dummy items with mix of some complete some marked as incomplete
        //sortByIncomplete()
        //Check that list returned by sortByComplete() matches all the items we set to incomplete and that every item in list has Item.Complete == false
    }

    @Test
    void saveAllItemToExtern() {
        //Create dummyy items
        //saveAllItemToExtern()
        //Read CSV file and check that all data stored in CSV file matches our dummy items
        //Check for item name, due date and description
    }

    @Test
    void saveAllListsToExtern() {
        //Create dummyy lists
        //saveAllListsToExtern()
        //Read CSV file and check that all data stored in CSV file matches our dummy lists
        //Check for list title
        //In each list check for item name, due date and description
    }

    @Test
    void loadSingleList() {
        //Put dummy list containing dummy items into csv file with saveAllItemToExtern()
        //loadSingleList()
        //Check that the data returned and displayed exactly matches the dummy data we put in
    }

    @Test
    void loadMultipleList() {
        //Create dummyy lists
        //saveAllListsToExtern()
        //Read CSV file and check that all data stored in CSV file matches our dummy lists
        //Check for list title
        //In each list check for item name, due date and description
    }
}
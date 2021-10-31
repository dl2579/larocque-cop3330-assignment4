package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Damian LaRocque
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
    public void addItem(Item i){
    }

    public void createList() {}
    public void removeList() {}
    public void editListTitle() {}

    public void editItem() {}
    public void removeItem() {}
    public void sortByComplete() {}
    public void sortByIncomplete() {}

}
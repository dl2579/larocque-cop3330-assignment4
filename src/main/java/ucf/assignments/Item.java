package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Damian LaRocque
 */
import java.time.LocalDate;

public class Item {
    private String description;
    private LocalDate dueDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return dueDate;
    }

    public void setDate(LocalDate date) {
        this.dueDate = dueDate;
    }

    public Item(LocalDate dueDate, String description){
        this.setDate(dueDate);
        this.setDescription(description);
    }

}

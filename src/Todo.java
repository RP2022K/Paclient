/*
* File: Todo.java
* Author: Gyüre Árpád
* Copyright: 2024, Gyüre Árpád
* Group: Szoft II-1-E
* Date: 2024-01-15
* Github: https://github.com/RP2022K/Paclient.git
* Licenc: GNU GPL
*/

public class Todo {
    int userId;
    int id;
    String title;
    Boolean completed;

    public Todo(int userId, int id, String title, Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}
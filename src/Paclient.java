/*
* File: Paclient.java
* Author: Gyüre Árpád
* Copyright: 2024, Gyüre Árpád
* Group: Szoft II-1-E
* Date: 2024-01-15
* Github: https://github.com/RP2022K/Paclient.git
* Licenc: GNU GPL
*/

import java.util.ArrayList;

import hu.szit.Convert;

public class Paclient {
    public Paclient() {
        super();

        TodoService service = new TodoService();
        String todos = service.GetTodos();

        ArrayList<Todo> todoList = Convert.toListObject(todos, Todo.class);

        for (Todo todo: todoList){
            System.out.println(todo.title);
        }
    }


}
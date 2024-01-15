/*
* File: TodoService.java
* Author: Gyüre Árpád
* Copyright: 2024, Gyüre Árpád
* Group: Szoft II-1-E
* Date: 2024-01-15
* Github: https://github.com/RP2022K/Paclient.git
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService()
    {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String GetTodos(){
        return client.get(url);
    }
}

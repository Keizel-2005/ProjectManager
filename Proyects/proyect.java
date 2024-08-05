/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyects;

import Tasks.Task;
import java.util.ArrayList;


public class proyect {
    private int id;
    private String name;
    private ArrayList<Task> task;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Task> getTask() {
        return task;
    }
    
    public void addTasks(Task task){
        this.addTasks(task);
    }

    public proyect(int id, String name) {
        this.id = id;
        this.name = name;
        this.task = new ArrayList<>();
    }

    public proyect() {
        this(0, "");
    }

    @Override
    public String toString() {
        return "proyect{" + "id=" + id + ", name=" + name + ", task=" + task + '}';
    }
}

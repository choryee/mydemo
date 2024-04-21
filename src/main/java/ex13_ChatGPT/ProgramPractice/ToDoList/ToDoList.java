package ex13_ChatGPT.ProgramPractice.ToDoList;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task{
    private String description;
    private boolean completed;

    Task(String description){
        this.description=description;
        this.completed=false;
    }

    public String getDescription(){
        return description;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void markAsCompleted(){
        completed=true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}

public class ToDoList {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task  2. View Tasks  3. Mark as Completed  4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter tasks description");
                    String description = sc.nextLine();
                    tasks.add(new Task(description));
                    System.out.println("Task added!!");
                    break;

                case 2 :
                    if(tasks.isEmpty()){
                        System.out.println("No tasks");
                    }else {
                        System.out.println("Tasks >>");
                        for(Task t : tasks){
                            System.out.println(t);
                        }
                    }
                    break;
                case 3 :
                   if(tasks.isEmpty()){
                       System.out.println("No tasks..");
                   }else{
                       System.out.println("Enter task number to mark as completed:");
                        int taskNum=sc.nextInt();
                        if(taskNum>=1){
                            tasks.get(taskNum-1).markAsCompleted();
                        }else {
                            System.out.println("Invalid task num");
                        }
                   }
                    break;

                default:
                    System.out.println("Invalid choice!!");
            }
        }// --while



    }
}


























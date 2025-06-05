import java.util.*;

class Task {
    String name;
    String category;
    String priority;
    boolean done;

    public Task(String name, String category, String priority) {
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.done = false;
    }

    public void markDone() {
        this.done = true;
    }

    public String toString() {
        return "[ " + (done ? "✔" : " ") + " ] " + name + " | " + category + " | Priority: " + priority;
    }
}

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MY TO-DO LIST ---");
            System.out.println("1. Add task");
            System.out.println("2. Show tasks");
            System.out.println("3. Mark task as done");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Task name: ");
                    String name = input.nextLine();
                    System.out.print("Category (personal/work/study): ");
                    String cat = input.nextLine();
                    System.out.print("Priority (high/medium/low): ");
                    String pri = input.nextLine();
                    tasks.add(new Task(name, cat, pri));
                    break;
                case 2:
                    System.out.println("\nYour tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Task number to mark as done: ");
                    int num = input.nextInt();
                    if (num >= 1 && num <= tasks.size()) {
                        tasks.get(num - 1).markDone();
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

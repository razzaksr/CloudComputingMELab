// //experiement 2: familiarize the use of SaaS(Software as a service)
// import java.util.ArrayList;
// import java.util.Scanner;

// class Task {
//     public String description;
//     public boolean completed;

//     public Task(String description) {
//         this.description = description;
//         this.completed = false;
//     }

//     @Override
//     public String toString() {
//         return "[" + (completed ? "X" : " ") + "] " + description;
//     }
// }

// class CollaborativeToDoList {
//     private ArrayList<Task> tasks=new ArrayList<>();

//     public void addTask(String description) {
//         tasks.add(new Task(description));
//     }

//     public void markTaskAsCompleted(int index) {
//         if (index >= 0 && index < tasks.size()) {
//             Task task = tasks.get(index);
//             task.completed=true;
//         } else {
//             System.out.println("Invalid task index");
//         }
//     }

//     public void displayTasks() {
//         System.out.println("Tasks:");
//         for (int i = 0; i < tasks.size(); i++) {
//             System.out.println((i + 1) + ". " + tasks.get(i));
//         }
//         System.out.println();
//     }
// }

// public class SaaSCollaborativeToDoListApp {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         CollaborativeToDoList toDoList = new CollaborativeToDoList();

//         while (true) {
//             System.out.println("1. Add Task");
//             System.out.println("2. Mark Task as Completed");
//             System.out.println("3. Display Tasks");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");

//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume the newline character

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter task description: ");
//                     String description = scanner.nextLine();
//                     toDoList.addTask(description);
//                     break;
//                 case 2:
//                     System.out.print("Enter task index to mark as completed: ");
//                     int index = scanner.nextInt();
//                     toDoList.markTaskAsCompleted(index - 1); // Adjust index to 0-based
//                     break;
//                 case 3:
//                     toDoList.displayTasks();
//                     break;
//                 case 4:
//                     System.out.println("Exiting program. Goodbye!");
//                     System.exit(0);
//                 default:
//                     System.out.println("Invalid choice. Please enter a valid option.");
//             }
//         }
//     }
// }


// experiement 2: familiarize the use of SaaS(Software as a service)
import java.util.ArrayList;
import java.util.Scanner;

class IdCard{
    public String name;
    public String rollnum;
    public String department;
    @Override
    public String toString() {
        return "IdCard [name=" + name + ", rollnum=" + rollnum + ", department=" + department + "]";
    }
}

class IdStore{
    ArrayList<IdCard> cards=new ArrayList<>();

    public void addCard(IdCard idCard){
        cards.add(idCard);
    }

    public void display(){
        System.out.println(cards);
    }

    public void getIdCard(int index){
        if(index<0&&index>=cards.size())
            System.out.println("Invalid index");
        else
            System.out.println(cards.get(index));
    }
}
public class SaaSCollaborativeToDoListApp{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        IdStore store=new IdStore();
        do{
            System.out.println("1.Add Id card\n2.Print All card\n3.print one card\n4.Exit");
            int option=scanner.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter name,rollno,department");
                    IdCard idCard=new IdCard();
                    
                    idCard.name=scanner.next();idCard.rollnum=scanner.next();
                    idCard.department=scanner.next();
                    store.addCard(idCard);
                    break;
                case 2:
                    store.display();break;
                case 3:
                    System.out.println("Enter the index to print idcard");
                    int index = scanner.nextInt();
                    store.getIdCard(index);break;
                default:return;
            }
        }while(true);
    }
}
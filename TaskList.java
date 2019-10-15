import java.util.ArrayList;

public class TaskList {

    protected ArrayList<Task> taskList;
    protected CommandReader commandReader;

    public TaskList() {
        taskList = new ArrayList<>();
        commandReader = new CommandReader();
    }

    public void addTask() {
        Task taskToAdd = commandReader.getTaskToAddFromUser();
        taskList.add(taskToAdd);
    }

    public void displayList() {
        for (Task task : taskList) {
            System.out.println(task);
        }
    }

    public Task getTaskByTitle(String titleToGet) {

        ArrayList<Task> tasksByTitle = new ArrayList<>();
        for (Task task : taskList) {
            if (task.title == titleToGet) {
                tasksByTitle.add(task);
            }
        }

        if (tasksByTitle.size() == 1) {
            return tasksByTitle.get(0);
        } else if (tasksByTitle.size() > 1){
            System.out.println("Your To Do List: ");
            System.out.println(tasksByTitle);
            System.out.println("More than one task has that title. Please specify which you want by ID (enter exactly).");
            InputReader inputReader = new InputReader();
            String idToGet = inputReader.readString();
            Task taskToReturn = null;
            for (Task task : tasksByTitle) {
                if (task.id.equals(idToGet)) {
                    taskToReturn = task;
                    System.out.println(taskToReturn);
                }
            }
            if (taskToReturn != null) {
                return taskToReturn;
            } else {
                System.out.println("That task ID doesn't exist. Please enter a new command.");
                return null;
            }
        } else {
            System.out.println("No task has that title. Please enter a new command.");
            return null;
        }
    }
}

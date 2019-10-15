public class CommandReader {

    protected InputReader inputReadFromUser;

    public CommandReader() {
        inputReadFromUser = new InputReader();
    }

    public Task getTaskToAddFromUser() {
        System.out.println("Please enter a short title for your task.");
        String title = inputReadFromUser.readString();
        System.out.println("Please enter a project to associate with the task.");
        String project = inputReadFromUser.readString();
        System.out.println("Please enter a due date for the new task");
        String date = inputReadFromUser.readString();
        System.out.println("Please enter a description of the task");
        String description = inputReadFromUser.readString();
        return new Task(title, project, date, description);
    }
}

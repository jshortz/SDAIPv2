import java.util.ArrayList;

public class ExecutableShell {

    protected ArrayList<String> commands;
    protected TaskList toDoList;

    public ExecutableShell() {
        commands = new ArrayList<>();
        commands.add("HELP");
        commands.add("VIEW LIST");
        commands.add("ADD TASK");
        commands.add("EDIT TASK");
        commands.add("REMOVE TASK");
        commands.add("SAVE AND QUIT");
        toDoList = new TaskList();
    }

    public void displayWelcome() {
        System.out.println("Welcome to the Task Manager. You may type HELP to view the user manual. " +
                "Please enter a command from the following options.");
    }

    public void displayCommands() {
        System.out.println(commands.toString());
    }

    public static String getCommand() {
        InputReader userInputReader = new InputReader();
        String command = userInputReader.readString();
        return command;
    }

    public boolean isValidCommand(String command) {
        return commands.contains(command);
    }

    public void processCommand(String command) {
        if (isValidCommand(command)) {
             switch (command) {
                 case "HELP" :
                     System.out.println("HELP ME");
                     break;
                 case "VIEW LIST" :
                     toDoList.displayList();
                     break;
                 case "ADD TASK" :
                     toDoList.addTask();
                     break;
                 case "EDIT TASK" :
                     // IMPLEMENT
                 case "REMOVE TASK" :
                     // IMPLEMENT
                 case "SAVE AND QUIT" :
                     // IMPLEMENT
            }
        } else {
            System.out.println("That is not a valid command");
        }
    }

    public static void main(String[] args) {
        ExecutableShell shell = new ExecutableShell();
        shell.displayWelcome();
        shell.displayCommands();
        shell.processCommand(getCommand());
        shell.processCommand(getCommand());
        shell.processCommand(getCommand());
    }
}

import java.util.Date;

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
        System.out.println("Please enter a description of the task");
        String description = inputReadFromUser.readString();
        Date date = getDateFromUser();
        System.out.println();
        return new Task(title, project, date, description);
    }

    public Date getDateFromUser() {
        System.out.println("Please enter the year the task is due as four digits between 2019 and 9999");
        int year = inputReadFromUser.readInt() - 1900;
        System.out.println("Please enter the month the task is due as two digits between 1 and 12");
        int month = inputReadFromUser.readInt() - 1;
        System.out.println("Enter the day the task is due as two digits between 1 and 31");
        int day = inputReadFromUser.readInt();
        System.out.println("Please enter the hour the task is due as two digits between 0 and 23");
        int hour = inputReadFromUser.readInt();
        System.out.println("Please enter the minute the task is due as two digits between 0 and 59");
        int minute = inputReadFromUser.readInt();
        return new Date(year, month, day, hour, minute);
    }
}

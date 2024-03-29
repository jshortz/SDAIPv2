import java.util.Date;

public class Task {

    protected String title;
    protected String project;
    protected Date date;
    protected String description;
    protected String id;

    public Task(String title, String project, Date date, String description) {
        this.title = title;
        this.project = project;
        this.date = date;
        this.description = description;
        id = "" + title + date.getYear() + date.getMonth() + date.getDay() + date.getHours() + "";
    }

    public String toString() {
        return "\nTitle: " + title + "\nProject: " + project + "\nDue Date: " + date + "\nDescription: " + description + "\nID: " + id + "\n";
    }

}

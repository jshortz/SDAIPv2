

public class Task {

    protected String title;
    protected String project;
    protected String date;
    protected String description;
    protected String id;

    public Task(String title, String project, String date, String description) {
        this.title = title;
        this.project = project;
        this.date = date;
        this.description = description;
        id = "" + title + date + "";
    }

    public String toString() {
        return "\nTitle: " + title + "\nProject: " + project + "\nDue Date: " + date + "\nDescription: " + description + "\nID: " + id + "\n";
    }

    public static void main(String[] args) {
        System.out.println(new Task("Dishes", "Household", "Oct. 15", "Wash and dry the dishes"));
    }
}

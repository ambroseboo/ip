public class Task {
    protected String description;
    protected boolean isDone;
    protected int number;

    public Task(String description, int number) {
        this.description = description;
        this.isDone = false;
        this.number = number;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public String getTask() {
        return number + "." + this.getTaskNoNum();
    }

    public String getTaskNoNum() {
        return "[" + this.getStatusIcon() + "] " + this.description;
    }
}
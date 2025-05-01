package round3Zoho;

public class Task {
    private final int taskId;
    private String taskName;

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public Task(int taskId, String taskName) {
        this.taskName = taskName;
        this.taskId = taskId;
    }
}

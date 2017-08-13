package uk.co.jamesridgway.spring.boot.oauth2.server.data;

public class Task {

    private String task;
    private boolean completed;

    public static Task completed(final String task) {
        return new Task(task, true);
    }

    public static Task incomplete(final String task) {
        return new Task(task, false);
    }

    public Task() {
    }

    private Task(final String task, final boolean completed) {
        this.task = task;
        this.completed = completed;
    }

    public String getTask() {
        return task;
    }

    public boolean isCompleted() {
        return completed;
    }
}

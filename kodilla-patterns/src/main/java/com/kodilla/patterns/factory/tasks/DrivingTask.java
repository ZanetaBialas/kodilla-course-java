package com.kodilla.patterns.factory.tasks;

public class DrivingTask extends PaintingTask implements Tasks {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted = false;



    public DrivingTask(final String taskName, final String where, final String using) {
        super(taskName, where, using);
        this.taskName = taskName;
        this.where = where;
        this. using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute driving task: " + getTaskName() + where + "using" + using);
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

    public String getUsing() {
        return using;
    }

    public String getWhere() {
        return where;
    }
}

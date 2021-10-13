package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }


    @Override
    public void executeTask() {
        System.out.println("Executing painting task: " + getTaskName());
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

    public String getColor ( ) {
        return color;
    }

    public String getWhatToPaint ( ) {
        return whatToPaint;
    }
}

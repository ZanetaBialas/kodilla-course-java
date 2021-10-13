package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Tasks {
    private final String taskName;
    private final String whatToBuy;
    private final String quantity;
    boolean isExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final String quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing shopping task: " + getTaskName());
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

    public String getQuantity() {
        return quantity;
    }
}

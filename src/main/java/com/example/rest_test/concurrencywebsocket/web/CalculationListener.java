package com.example.rest_test.concurrencywebsocket.web;

import java.util.concurrent.Future;

import javax.enterprise.concurrent.ManagedExecutorService;
import javax.enterprise.concurrent.ManagedTask;
import javax.enterprise.concurrent.ManagedTaskListener;

import com.example.rest_test.concurrencywebsocket.beans.MonitorBean;

public class CalculationListener implements ManagedTaskListener {

    private final MonitorBean mb;

    public CalculationListener(MonitorBean mb) {
        this.mb = mb;
    }

    @Override
    public void taskSubmitted(Future<?> future, ManagedExecutorService executor, Object task) {
        ((ManagedTask) task).getExecutionProperties().put(Calculation.SUBMIT_TIME_KEY, Long.toString(System.currentTimeMillis()));
    }

    @Override
    public void taskAborted(Future<?> future, ManagedExecutorService executor, Object task, Throwable exception) {
        System.out.println("Task Aborted: " + task);
    }

    @Override
    public void taskDone(Future<?> future, ManagedExecutorService executor, Object task, Throwable exception) {
        ((ManagedTask) task).getExecutionProperties().put(Calculation.END_TIME_KEY, Long.toString(System.currentTimeMillis()));
        mb.taskCompleted(task);

    }

    @Override
    public void taskStarting(Future<?> future, ManagedExecutorService executor, Object task) {
        ((ManagedTask) task).getExecutionProperties().put(Calculation.START_TIME_KEY, Long.toString(System.currentTimeMillis()));
    }

}

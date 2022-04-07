package ru.eam.worker;

import ru.eam.interfaces.OnTaskDoneListener;
import ru.eam.interfaces.OnTaskErrorListener;

public class Worker {

    private final OnTaskDoneListener callback;

    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("Start task : %s \n", i+1);
            if (i == 32) {
                errorCallback.onError();
                continue;
            }
            callback.onDone(String.format("Task %s is done", i+1));
        }
    }
}

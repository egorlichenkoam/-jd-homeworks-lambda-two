package ru.eam.interfaces;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}

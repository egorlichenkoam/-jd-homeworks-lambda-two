package ru.eam;

import ru.eam.interfaces.OnTaskDoneListener;
import ru.eam.interfaces.OnTaskErrorListener;
import ru.eam.worker.Worker;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker(System.out::println, () -> System.out.println("Вы не понимает. Это другое."));
        worker.start();
    }
}

package com.keelient;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 1500; i++) {
            System.out.print("M");
        }

        Task task = new Task();
        task.doTask();
    }
}

class Task {
    public void doTask() {
        for (int i = 0; i < 1500; i++) {
            System.out.print("T");
        }
    }
}
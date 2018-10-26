package org.exercises.calculator.domain;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    private Queue<PrintJob> jobs = new LinkedList<>();

    public void addToQueue(PrintJob job){
        jobs.add(job);
    }

    public boolean startPrinting(){
        // complicated method
        return false;
    }
}

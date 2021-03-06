/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprogramme;

import java.util.*;

/**
 * MyPriorityQueue.java
 *
 * @author Aaron - x19404024 27/03/2021
 */
public class MyPriorityQueue implements PQInterface {

    // Create an ArrayList
    private ArrayList<PQElement> thePQueue;

    public MyPriorityQueue() {
        thePQueue = new ArrayList<PQElement>();
    }

    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    public int size() {
        return thePQueue.size();
    }

    private int findInsertPosition(int newkey) {
        boolean found;
        PQElement elem;
        int position;
        found = false;
        position = 0;
        while (position < thePQueue.size() && !found) {
            elem = thePQueue.get(position);
            if (elem.getKey() > newkey) {
                position = position + 1;
            } else {
                found = true;
            }
        }
        return position;
    }

    // Add a new vaccine recipient to the queue
    public void enqueue(int priorkey, Object item) {
        int index;
        PQElement elem = new PQElement(priorkey, (VaccinationRecipients) item);

        index = findInsertPosition(priorkey);

        if (index == size()) {
            thePQueue.add(elem);
        } else {
            thePQueue.add(index, elem);
        }
    }

    // The highest priority recipients are taken 
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    public String printPQueue() {
        String printStr = new String();
        PQElement elem;
        for (int i = 0; i < thePQueue.size(); i++) {
            elem = thePQueue.get(i);
            printStr = printStr.concat(elem.printVaccinationRecipients() + " | priority = " + elem.getKey() + "\n");
        }
        return printStr;
    }

}

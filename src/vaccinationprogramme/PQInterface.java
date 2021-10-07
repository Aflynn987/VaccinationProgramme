/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprogramme;

import java.util.Iterator;

/**
 * PQInterface.java
 * @author Aaron
 * 27/03/2021
 */
public interface PQInterface {
    public void enqueue(int key, Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();
}

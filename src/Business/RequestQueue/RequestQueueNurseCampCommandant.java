/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestQueue;

import java.util.ArrayList;

/**
 *
 * @author nilay
 */
public class RequestQueueNurseCampCommandant {
 
    private ArrayList<WorkRequestNurseCampCommandant> workRequestList;
    
    public RequestQueueNurseCampCommandant() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequestNurseCampCommandant> getWorkRequestList() {
        return workRequestList;
    }
}

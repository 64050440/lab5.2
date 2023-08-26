/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorebean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author User
 */
public class ScoreLine {
    
    private String SetSomeData;

    public static final String PROP_SETSOMEDATA = "SetSomeData";

    public String getSetSomeData() {
        return SetSomeData;
    }

    public void setSetSomeData(String SetSomeData) {
        String oldSetSomeData = this.SetSomeData;
        this.SetSomeData = SetSomeData;
        propertyChangeSupport.firePropertyChange(PROP_SETSOMEDATA, oldSetSomeData, SetSomeData);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}

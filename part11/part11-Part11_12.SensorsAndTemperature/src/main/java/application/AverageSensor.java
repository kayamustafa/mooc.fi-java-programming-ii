
package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor{

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readValues;
            
    public AverageSensor(){
        sensors = new ArrayList<>();
        readValues = new ArrayList<>();
    }
    
    @Override
    public boolean isOn() {
        return !sensors.stream().map(sensor -> sensor.isOn()).collect(Collectors.toList()).contains(false);
    }

    @Override
    public void setOn() {
        Iterator<Sensor> iterator = sensors.iterator();
        while(iterator.hasNext()){
            iterator.next().setOn();
        }
    }

    @Override
    public void setOff() {
        sensors.get(0).setOff();
    }

    @Override
    public int read() {
        if(sensors.isEmpty() || !this.isOn()) throw new IllegalStateException();
        int average = (int) sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
        readValues.add(average);
        return average;
    }
    
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return readValues;
    }
    
}

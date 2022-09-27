
public class HealthStation {
    private int count;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        count++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int currentWeight = person.getWeight();
        currentWeight++;
        
        person.setWeight(currentWeight);
        
    }
    
    public int weighings(){
        
        return count;
    }

}

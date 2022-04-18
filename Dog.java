public class Dog extends Animal {
    int dist;
    
    public Dog(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
    }
    
    @Override
    public void swim(int dist) {
        if (this.distanceSwim >= dist) { 
            System.out.println(this.name + " swim " + dist + " m.");
        }
    }
}

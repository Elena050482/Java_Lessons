public class Cat extends Animal {
    int dist;
    
    public Cat(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
    }

    @Override
    public void swim(int dist) {
        System.out.println(this.name + " " + "Cat can't swim!");
    }
}

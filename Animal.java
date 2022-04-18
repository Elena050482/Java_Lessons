/**
* Java 1. Homework 6
*
* @ author Elena Zavarzina
* @ version 18.04.2022
*/

public abstract class Animal {
    public String name;
    public int distanceRun;
    public int distanceSwim;

    public Animal(String name, int distanceRun, int distanceSwim) {
    this.name = name;
    this.distanceRun = distanceRun;
    this.distanceSwim = distanceSwim;
}

    public void run(int dist) {
        if (this.distanceRun >= dist) {
            System.out.println(this.name + " run " + dist + " m.");
        } else {
            System.out.println(this.name + " can't run so far.");
        }
    }

    public abstract void swim(int dist);

}

/**
* Java 1. Homework 7
*
* @ author Elena Zavarzina
* @ version 20.04.2022
*/

//1. Расширить задачу про котов и тарелки с едой.

//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды 
//(например, в миске 10 еды, а кот пытается покушать 15-20).

//3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). 
//Если коту удалось покушать (хватило еды), сытость = true.

//4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, 
//то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

//5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки 
//и потом вывести информацию о сытости котов в консоль.

//6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.



import java.util.Scanner;

public class HomeWorkSeven {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int action;
        Cat[] arrCats = new Cat[4];
        arrCats[0] = new Cat("Пушистик", 25, false);
        arrCats[1] = new Cat("Брют", 15, false);
        arrCats[2] = new Cat("Рыжик", 20, false);
        arrCats[3] = new Cat("Сэм", 8, false);

        Plate plate = new Plate(50);
        
        plate.info();
        for (int i = 0; i < arrCats.length; i++) {
            if (arrCats[i].fullness == false && arrCats[i].appetite <= plate.food){
                arrCats[i].eat(plate);
                arrCats[i].fullness = true;
                System.out.println("Кот " + arrCats[i].name + " покушал!");
            } else {
                System.out.println("Кот " + arrCats[i].name + " не наелся!");
            }
        }
        plate.info();
        System.out.println("Сколько добавить еды?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}

/**
* Java 1. Homework 4
*
* @ author Elena Zavarzina
* @ version 06.04.2022
*/

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    
    Random random;
    Scanner scanner;
    char [][] table;
    
    public static void main(String[] arg) {
        new TicTacToe().game();
    }
        
    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }
        
    void game() {
        initTable();
        while(true) {
            printTable();
            turnHuman();
            if (checkWin('x')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW!");
                break;
            }
            turnAI();
            if (checkWin('o')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }
    
    void initTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table [x][y] = '.';
            }
        }
    }
    
    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3] : ");
            x = scanner.nextInt() -1;
            y = scanner.nextInt() -1;
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
    }
    
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';        
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';    
    }
    
    boolean checkWin(char ch) {
        int countV;
        int countH;
        for (int i = 0; i < 3 - 1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j < 3 - 1; j++) {
                if (table[i][j] == '.') {
                    countH++;
                    if (countH == 3) return true;
                }
                if (table[j][i] == '.') {
                    countV++;
                    if (countV == 3) return true;
                }
        
                if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
                if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
            }
        }
        return false;
    }
    
    boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table [x][y] == '.') {
                    return false;
                }
            }
         }
         return true;
    }
}
    
    
    
   
   
   
   
  

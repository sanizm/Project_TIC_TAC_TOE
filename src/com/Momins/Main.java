package com.Momins;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] Grid = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '}};
        System.out.println("Welcome to TicTacToe!" +
                "\n Please enter your respected name");
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.next();
        String player2 = scanner.next();
        System.out.println("Player1 :: " + player1 +
                "\n Player2 ::" + player2);
        System.out.println("Please enter the symbol you would like to take 'X' or 'O'. ");
        String sym1 = scanner.next();
        System.out.println(player1 + " has this Symbol: " + sym1);
        String sym2 = scanner.next();
        System.out.println(player2 + " has this Symbol: " + sym2);
        grid(Grid);
        char symbol;
        char symbol1;
        if (sym1.equals("X")) {
            symbol = 'X';
        } else {
            symbol = 'O';
        }
        if (sym2.equals("O")) {
            symbol1 = 'O';
        } else {
            symbol1 = 'X';
        }
        char ps1 = ' ';
        char ps2 = ' ';
        char ps3 = ' ';
        char ps4 = ' ';
        char ps5 = ' ';
        char ps6 = ' ';
        char ps7 = ' ';
        char ps8 = ' ';
        char sym;
        boolean s1 = true;
        boolean value = false;
        String winner1;
        String winner2;
        while (!value) {
            Scanner Number = new Scanner(System.in);
            System.out.println("Enter Position (1-9).");
            if (s1) {
                if(sym1.equals("X")){
                    winner1 = player1;
                    System.out.println(winner1 + " your turn");
                }else{
                    winner2 = player1;
                    System.out.println(winner2 + " your turn");
                }
                sym = symbol;
                s1 = false;
//                System.out.println(player1 + " your turn");
//                sym = symbol;
//                s1 = false;
            } else {
                if(sym2.equals("O")){
                    winner2 = player2;
                    System.out.println(winner2 + " your turn");
                }else{
                    winner1 = player2;
                    System.out.println(winner1 + " your turn");
                }
                sym = symbol1;
                s1 = true;
//                System.out.println(player2 + " your turn");
//                sym = symbol;
//                s1 = true;
            }
            int IndexNo = Number.nextInt();
            switch (IndexNo) {
                case 1:
                    if (ps1 == ' ') {
                        Grid[0][0] = sym;
                    } else {
                        System.out.println("This position is occupied try other options");
                        s1 = sym != 'O';
                    }
                    ps1 = 'a';
                    grid(Grid);
                    break;
                case 2:
                    if (ps2 == ' ') {
                        Grid[0][2] = sym;
                    } else {
                        System.out.println("This position is occupied try other options");
                        s1 = sym != 'O';
                    }
                    ps2 = 'a';
                    grid(Grid);
                    break;
                case 3:
                    if (ps3 == ' ') {
                        Grid[0][4] = sym;
                    } else {
                        System.out.println("This position is occupied try other options");
                        s1 = sym != 'O';
                    }
                    ps3 = 'a';
                    grid(Grid);

                    if (sym1.equals("X")) {
                        winner1 = player1;
                        if ((Grid[0][0] == 'X') && (Grid[0][2] == 'X') && (Grid[0][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    } else {
                        winner2 = player1;
                        if ((Grid[0][0] == 'O') && (Grid[0][2] == 'O') && (Grid[0][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                    }
                    if (sym2.equals("O")) {
                        winner2 = player2;
                        if ((Grid[0][0] == 'O') && (Grid[0][2] == 'O') && (Grid[0][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                    } else {
                        winner1 = player2;
                        if ((Grid[0][0] == 'X') && (Grid[0][2] == 'X') && (Grid[0][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    }
                    break;
                case 4:
                    if (ps4 == ' ') {
                        Grid[2][0] = sym;
                    } else {
                        System.out.println("This position is occupied try other options");
                        s1 = sym != 'O';
                    }
                    ps4 = 'a';
                    grid(Grid);
                    break;
                case 5:
                    if (ps5 == ' ') {
                        Grid[2][2] = sym;
                    } else {
                        System.out.println("This position is occupied try other options");
                        s1 = sym != 'O';
                    }
                    ps5 = 'a';
                    grid(Grid);
                    break;
                case 6:
                    if (ps6 == ' ') {
                        Grid[2][4] = sym;
                    } else {
                        System.out.println("This position is occupied try other options");
                        s1 = sym != 'O';
                    }
                    ps6 = 'a';
                    grid(Grid);
                    if (sym1.equals("X")) {
                        winner1 = player1;
                        if ((Grid[2][0] == 'X') && (Grid[2][2] == 'X') && (Grid[2][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    } else {
                        winner2 = player1;
                        if ((Grid[2][0] == 'O') && (Grid[2][2] == 'O') && (Grid[2][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                    }
                    if (sym2.equals("O")) {
                        winner2 = player2;
                        if ((Grid[2][0] == 'O') && (Grid[2][2] == 'O') && (Grid[2][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                    } else {
                        winner1 = player2;
                        if ((Grid[2][0] == 'X') && (Grid[2][2] == 'X') && (Grid[2][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    }
                    break;
                case 7:
                    if (ps7 == ' ') {
                        Grid[4][0] = sym;
                    } else {
                        System.out.println("This position is occupied try other options");
                        s1 = sym != 'O';
                    }
                    ps7 = 'a';
                    grid(Grid);
                    if (sym1.equals("X")) {
                        winner1 = player1;
                        if ((Grid[0][0] == 'X') && (Grid[2][0] == 'X') && (Grid[4][0] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][4] == 'X') && (Grid[2][2] == 'X') && (Grid[4][0] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    } else {
                        winner2 = player1;
                        if ((Grid[0][0] == 'O') && (Grid[2][0] == 'O') && (Grid[4][0] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][4] == 'O') && (Grid[2][2] == 'O') && (Grid[4][0] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }

                    }
                    break;
                case 8:
                    if (ps8 == ' ') {
                        Grid[4][2] = sym;
                    } else {
                        System.out.println("This position is occupied try other options");
                        s1 = sym != 'O';
                    }
                    ps8 = 'a';
                    grid(Grid);
                    if (sym1.equals("X")) {
                        winner1 = player1;
                        if ((Grid[0][2] == 'X') && (Grid[2][2] == 'X') && (Grid[4][2] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    } else {
                        winner2 = player1;
                        if ((Grid[0][2] == 'O') && (Grid[2][2] == 'O') && (Grid[4][2] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                    }
                    if (sym2.equals("O")) {
                        winner2 = player2;
                        if ((Grid[0][2] == 'O') && (Grid[2][2] == 'O') && (Grid[4][2] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                    } else {
                        winner1 = player2;
                        if ((Grid[0][2] == 'X') && (Grid[2][2] == 'X') && (Grid[4][2] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    }
                    break;
                case 9:
                        Grid[4][4] = sym;
                    grid(Grid);

                    if (sym1.equals("X")) {
                        winner1 = player1;
                        if ((Grid[4][0] == 'X') && (Grid[4][2] == 'X') && (Grid[4][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][4] == 'X') && (Grid[2][4] == 'X') && (Grid[4][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][0] == 'X') && (Grid[2][2] == 'X') && (Grid[4][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    } else {
                        winner2 = player1;
                        if ((Grid[4][0] == 'O') && (Grid[4][2] == 'O') && (Grid[4][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][4] == 'O') && (Grid[2][4] == 'O') && (Grid[4][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][0] == 'O') && (Grid[2][2] == 'O') && (Grid[4][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                    }

                    if (sym2.equals("O")) {
                        winner2 = player2;
                        if ((Grid[4][0] == 'O') && (Grid[4][2] == 'O') && (Grid[4][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][4] == 'O') && (Grid[2][4] == 'O') && (Grid[4][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][0] == 'O') && (Grid[2][2] == 'O') && (Grid[4][4] == 'O')) {
                            System.out.println("Congratulation! " + winner2 + " you won!");
                            value = true;
                        }
                    } else {
                        winner1 = player2;
                        if ((Grid[4][0] == 'X') && (Grid[4][2] == 'X') && (Grid[4][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][4] == 'X') && (Grid[2][4] == 'X') && (Grid[4][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                        if ((Grid[0][0] == 'X') && (Grid[2][2] == 'X') && (Grid[4][4] == 'X')) {
                            System.out.println("Congratulation! " + winner1 + " you won!");
                            value = true;
                        }
                    }
                    break;

                default:
                    break;
            }

        }
    }

    public static void grid(char[][] Grid) {
        for (char[] row : Grid) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }

}







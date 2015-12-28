/**
 * JavaForBegginers created by Admin on 20.12.2015 10:07.
 */
public class StrDemo {
    public static void main(String args[])
        throws java.io.IOException {                        //it needs for input output
        System.out.println("First line\nSecond line");
        System.out.println("A\tB\tC\nD\tE\tF");
        int x1 = 10, y1;
        System.out.println("x1 = " + x1 + " y1 = ++x1 = " + ++x1);
        int x2 = 10, y2;
        System.out.println("x2 = " + x2 + " y2 = x2++ = " + x2++);
        //cicle 'FOR' example
        int i;
        int sum = 0;

        for(i = 1; i <= 5; sum += i++);
        //sum += i++  the same as sum = sum + i; i++;
            System.out.println("Sum is " + sum);

        //cicle 'WHILE' example
        char ch;
        ch = 'a';

        while(ch <= 'z') {
            System.out.print(ch);
            ch++;
        }

        //cicle 'DO WHILE' example
        char ignore, answer = 'S';

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.println("Can you guess it: ");

            //input char from keyboard
            ch = (char) System.in.read();
            //отвергнуть все остальные символы во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            System.out.println("your answer is " + ch + " but ");
            if(ch == answer) System.out.println("** Right **\n");
            else {
                System.out.println("...Sorry, you're ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        } while(answer != ch);

        //cicle 'SWITCH' example
        char choice ;
        System.out.println("Input 1 or 2 ");
        choice = (char) System.in.read();
        switch(choice) {
            case '1':
                System.out.println("Your choice is " + choice);
                break;
            case '2':
                System.out.println("Your choice is " + choice);
                break;
        }

        //continue example
        for(i = 0; i<=100; i++) {
            System.out.println("i = " + i + "(i%2) = " + (i%2));
            if((i % 2) != 0) continue;    //завершать шаг итерации цикла
            System.out.println("i = " + i);
        }
    }
}
/*
output:

First line
Second line
A	B	C
D	E	F
x1 = 10 y1 = ++x1 = 11
x2 = 10 y2 = x2++ = 10

 */
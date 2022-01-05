import java.util.Scanner;

interface Add {
    void input();
    void add();
}

class Main implements Add {

    int a, b, c;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public void add() {
        c = a + b;
    }

    void display() {
        System.out.println("Sum is:" + c);
    }

    public static void main(String args[]) {
        Main t = new Main();
        t.input();
        t.add();
        t.display();
    }
}

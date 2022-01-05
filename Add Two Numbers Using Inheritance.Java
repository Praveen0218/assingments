import java.util.Scanner;

class add {
    static int a, b, c;
    Scanner sc = new Scanner(System.in);
}

class sub extends add {

    void input() {
        System.out.print("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}

class Main extends add {

    void add() {
        c = a + b;
    }

    void result() {
        System.out.println("Sum is:" + c);
    }

    public static void main(String args[]) {
        B obj1 = new B();
        obj1.input();

        Main obj2 = new Main();
        obj2.add();
        obj2.result();
    }
}

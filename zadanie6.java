package projekt;

public class Projekt {
    public static void main(String args []) {
Scanner scan = new Scanner(System.in);
System.out.println("Podaj liczbę 1");
int a = scan.nextInt();

Scanner scan = new Scanner(System.in);
System.out.println("Podaj liczbę 2");
int b = scan.nextInt();

Scanner scan = new Scanner(System.in);
System.out.println("Podaj liczbę");
int c = scan.nextInt();


if ((a > b) && (a > c) && (b > c)) {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
else if ((b > a) && (b > c) && (a > c)) {
    System.out.println(b);
    System.out.println(a);
    System.out.println(c);
}
else if ((c > b) && (c > a) && (b > a)) {
    System.out.println(c);
    System.out.println(b);
    System.out.println(a);
}
else if ((c > b) && (c > a) && (a > b)) {
    System.out.println(c);
    System.out.println(a);
    System.out.println(b);
}
    }
}
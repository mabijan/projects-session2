import java.util.Scanner;
public class library_methods {

    int[] BOOK = new int[100];

    public void BOOK_CODE() {
        Scanner input = new Scanner(System.in);

        for (int i = 001; i <= 10; i++) {
            System.out.print("insert the book codes:");
            BOOK[i] = input.nextInt();
        }
    }

    public void BOOK_DATA() {
        for (int i = 001; i <= 10; i++) {
            System.out.println("Book" + i + "===" + BOOK[i]);
            if (i % 3 == 0) {
                System.out.println("Book" + BOOK[i] + " is currently lent!");
            }
        }
    }

    public void VALUE(){
        for(int j = 001;j <= 10;j++){
            if (j >= 7)
                System.out.println("book number" + j + " is " + "90000 Toman");
            else if (j < 7)
                System.out.println("book number" + j + " is " + "50000 Toman");
        }

    }
}
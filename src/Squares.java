import java.util.Scanner;
public class Squares{
    public static void main(System[]arg){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input number:" );
        int userInput;
        userInput = keyboard.nextInt();
        System.out.println("Number    Square");
        for ( int i=1; i >= userInput; i++){
            System.out.println(i + "    "+i*i );
        }

    }

}

/*
import java.util.Scanner;

public class Squares {
    public static void main(String []arg) {
        int userInput;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = keyboard.nextInt();
        System.out.println("Number          Square");

        for (int i=0;i<=userInput ; i++){
            System.out.println(i+ "         "+ i*i);
        }
    }
}
userInput = keyboard.nextInt();
        System.out.println("Number          Square");

        for (int i=0;i<=userInput ; i++){
            System.out.println(i+ "         "+ i*i);
        }
    }
}userInput = keyboard.nextInt();
        System.out.println("Number          Square");

        for (int i=0;i<=userInput; i++){
            System.out.println(i+ "         "+ i*i);
        }
    }
}
*/


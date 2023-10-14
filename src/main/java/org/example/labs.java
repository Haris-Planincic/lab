//1.
/*class printName {
    public static void main (String[] args) {
        System.out.print("Haris Planincic");
    }
}*/

//2.
/*class printWords {
    public static void main (String[] args) {
        System.out.print("Hello world\n");
        System.out.print("(and all the people of the world.)");

    }
}*/
/*
3.
class printWords {
    public static void main (String[] args) {
        int x=3600*24*365;
        System.out.print("There are " + x + " seconds in a year.");
    }
}*/

//4.

/*import java.util.Scanner;

class printNums {
    public static void main (String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        int sum = number+number2;
        System.out.print("The sum is " + sum);
    }
}*/

//5.

/*import java.util.Scanner;
class printNums {
    public static void main (String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        if (number>number2) {
            System.out.print("Largest number: " + number);
        }
        else if (number<number2) {
            System.out.print("Largest number: " + number2);
        }
        else {
            System.out.print("The numbers are equal.");
        }
    }
}*/

//6.

/*import java.util.Scanner;
class printNums {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (number >= 0) {
            System.out.print("The number is positive!");
        } else {
            System.out.print("The number is negative!");
        }
    }
}*/
//7.
/*import java.util.Scanner;
class printNums {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Type a password: ");
            String password = reader.nextLine();
            if (password.equals("code")) {
                System.out.print("Correct!\n");
                break;

            } else {
                System.out.print("Wrong\n");
            }
        }
        System.out.print("The secret is hefuhe");
    }
}*/
/*import java.util.Scanner;
class printNums {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        int read;
        System.out.print("Enter first number: ");
        read =  Integer.parseInt(reader.nextLine());
        sum+=read;
        System.out.print("Enter second number: ");
        read =  Integer.parseInt(reader.nextLine());
        sum+=read;
        System.out.print("Enter third number: ");
        read =  Integer.parseInt(reader.nextLine());
        sum+=read;
        System.out.print("The sum is: " + sum);

    }
}*/
/*import java.util.Scanner;
class printNums {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.print("Enter a number: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read==0) {
                break;
            }
            sum+=read;
            System.out.print("The current sum is: " + sum + "\n");
        }
        System.out.print("The final sum is " + sum);

    }
}*/
/*import java.util.Scanner;
class printNums {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int read1, read2, i=0;
        System.out.print("Enter first number: ");
        read1 = Integer.parseInt(reader.nextLine());
        System.out.print("Enter second number: ");
        read2 = Integer.parseInt(reader.nextLine());
        i=read1;
        if (read2>read1) {
            while (i<=read2) {
                System.out.print(i + "\n");

                i++;

            }
        }

    }
}*/
/*import java.util.Scanner;
class printNums {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int read, i=0, sum=0;
        System.out.print("Enter a number: ");
        read = Integer.parseInt(reader.nextLine());
        while (i<=read) {
            int temp=(int)Math.pow(2,i);
            sum+=temp;
            i++;
        }
        System.out.print("The result is " + sum);

    }
}*/

/*import java.util.Scanner;
class printNums {
    public static void main(String[] args) {
        printText(3);

    }
    public static void printText(int n) {
        int i=0;
        while (i<n) {
            System.out.print("*");
            i++;
        }
    }
}*/
/*class printNums {
    public static void main(String[] args) {
        printText();

    }
    public static void printText() {
        System.out.print("In the beginning there were the swamp, the hoe and Java.");
    }
}*/

/*class printNums {
    public static void main(String[] args) {
        printText(5);

    }
    public static void printText(int n) {
        for (int i=0; i<=n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}*/
/*class printNums {
    public static void main(String[] args) {
        printText(5);

    }
    public static void printText(int n) {

        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}*/
/*class printNums {
    public static void main(String[] args) {
        printText(5);

    }
    public static void printText(int n) {
        for (int i=0; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }

    }
}*/
/*class printNums {
    public static void main(String[] args) {
        printText(5);

    }
    public static void printText(int n) {
        for (int i=0; i<=n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }

    }
}*/




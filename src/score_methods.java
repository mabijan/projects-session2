import java.util.Scanner;

public class score_methods {
   public void get_average_data() {
        Scanner input = new Scanner(System.in);

        System.out.print("How many subjects you have? = ");
        int size = input.nextInt();
        int[] score_subjects = new int[size];
        int[] argument_subjects = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("please enter your score and the argument of the subject!");
            System.out.print("the score:");
            score_subjects[i] = input.nextInt();
            System.out.print("the argument:");
            argument_subjects[i] = input.nextInt();
        }

        double ave = 0;
        double count = 0;
        double all = 0;

        for (int i = 0; i < size; i++){
            ave = (count + (score_subjects[i] * argument_subjects[i])) / (all + argument_subjects[i]);
        }
        System.out.format("your average score is:%f\n", ave);

        if (ave >= 12){
            System.out.println("You passed the season!");
        } else {
            System.out.println("You failed the season!");
        }
    }
}


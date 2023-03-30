import java.util.Scanner;
public class DivisionQuestion {
    private static DivisionQuestion[] questions;
    private static int[] useranswers= new int[10];

    public static void main(String[] args) {
        System.out.println();
        System.out.println(" division quiz go ");
        System.out.println();
        createquiz();
        givequiz();
        gradequiz();
    } // main
        private int a, b;
        public DivisionQuestion() {
            b = (int) (Math.random() * 8 + 1);
            a = (int) (Math.random() * 25 + 2)*b;
        }

        static void createquiz() {
            questions = new DivisionQuestion[10];
            for ( int i = 0; i < 10; i++ ) {
                questions[i] = new DivisionQuestion();
            }
        }
        public String getQuestion () {
            return "What is " + a + " / " + b + " ?";
        }
        public int getCorrectanswer () {
            return a / b;
        }

    public static void givequiz() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            int questionnum = i +1;
            System.out.printf(" Question %2d: %s ",
                     questionnum, questions[i].getQuestion());
            useranswers[i] = scanner.nextInt();
        }
    }
    public static int gradequiz () {
        System.out.println();
        int grade;
        int numbercorrect = 0;
        for (int i = 0; i < 10; i++) {

            int questionnum = i + 1;
            System.out.printf("   Question %2d:  %s  correct answer is %d ",
                    questionnum, questions[i].getQuestion(), questions[i].getCorrectanswer());
            if (useranswers[i] == questions[i].getCorrectanswer()) {
                System.out.println(" Correct ");
                numbercorrect++;
            } else {
                System.out.println(" you answered " + useranswers[i] + ", nope ");
            }
        }
        grade = numbercorrect * 10;
        int divisionscore = grade;
        System.out.println();
        System.out.println(" You got " + numbercorrect + " questions correct. ");
        System.out.println(" Your grade on the quiz is " + grade);
        System.out.println();
        return divisionscore;
    }
} // DivisionQuestion
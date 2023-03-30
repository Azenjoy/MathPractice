import java.util.Scanner;
public class AdditionQuestion {
    private static AdditionQuestion[] questions;
    private static int[] useranswers= new int[20];

    public static void main(String[] args) {
        System.out.println();
        System.out.println(" addition quiz go ");
        System.out.println();
        createquiz();
        givequiz();
        gradequiz();
    } // main
        private int a, b;

        public AdditionQuestion() {
            a = (int) (Math.random() * 50 + 1);
            b = (int) (Math.random() * 50 + 1);
        }
        static void createquiz() {
            questions = new AdditionQuestion[20];
            for ( int i = 0; i < 20; i++ ) {
                questions[i] = new AdditionQuestion();
            }
        }
        public String getQuestion () {
            return "What is " + a + " + " + b + " ?";
        }
        public int getCorrectanswer () {
            return a + b;
        }

    public static void givequiz() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 20; i++) {
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
        for (int i = 0; i < 20; i++) {
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
        grade = numbercorrect * 10/2;
        int additionscore = grade;
        System.out.println();
        System.out.println(" You got " + numbercorrect + " questions correct. ");
        System.out.println(" Your grade on the quiz is " + grade);
        System.out.println();
        return additionscore;
    }
} // AdditionQuestion
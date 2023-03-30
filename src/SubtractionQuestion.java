import java.util.Scanner;
public class SubtractionQuestion {
    private static SubtractionQuestion[] questions;
    private static int[] useranswers= new int[10];

    public static void main(String[] args) {
        System.out.println();
        System.out.println(" subtraction quiz go ");
        System.out.println();
        createquiz();
        givequiz();
        gradequiz();
    } // main
        private int a, b,c,d;
        public SubtractionQuestion() {
               c = (int) (Math.random() * 51 + 1);
               d = (int) (Math.random() * 50 + 1);
            if (c>d) {
                a = c;
                b = d;
            }else{
                a = d;
                b = c;
           }
        }
        static void createquiz() {
            questions = new SubtractionQuestion[10];
            for ( int i = 0; i < 10; i++ ) {
                questions[i] = new SubtractionQuestion();
            }
        }
        public String getQuestion () {
               return "What is " + a + " - " + b + " ?";
                  }
        public int getCorrectanswer () {
            return a - b;
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
        int subtractionscore = grade;
        System.out.println();
        System.out.println(" You got " + numbercorrect + " questions correct. ");
        System.out.println(" Your grade on the quiz is " + grade);
        System.out.println();
        return subtractionscore;
    }
} // SubtractionQuestion
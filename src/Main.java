
public class Main {

    public static void main(String[] args) {
        MultiplicationTables.mu();
        System.out.println();
        System.out.println(" hi, here are some questions to sharpen your math skills ");

        new AdditionQuestion();
        System.out.println();
        System.out.println(" addition quiz go ");
        System.out.println();
        AdditionQuestion.createquiz();
        AdditionQuestion.givequiz();
        int additionscore = AdditionQuestion.gradequiz();

        new SubtractionQuestion();
        System.out.println();
        System.out.println(" subtraction quiz go ");
        System.out.println();
        SubtractionQuestion.createquiz();
        SubtractionQuestion.givequiz();
        int subtractionscore = SubtractionQuestion.gradequiz();

        new MultiplicationQuestion();
        System.out.println();
        System.out.println(" multiplication quiz go ");
        System.out.println();
        MultiplicationQuestion.createquiz();
        MultiplicationQuestion.givequiz();
        int muliplicationscore = MultiplicationQuestion.gradequiz();

        new DivisionQuestion();
        System.out.println();
        System.out.println(" division quiz go ");
        System.out.println();
        DivisionQuestion.createquiz();
        DivisionQuestion.givequiz();
        int divisionscore = DivisionQuestion.gradequiz();
        float totalscore = (float) ((additionscore + subtractionscore + muliplicationscore + divisionscore)/4.00);
        System.out.println(" __________________________ ");
        System.out.printf("totalscore : %3.2f", totalscore);
        System.out.println();
        System.out.println("Hello world!");
    }  // main
}  // Main
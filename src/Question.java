
public class Question {
    private String questionText;
    private String[] options;
    private char correctAnswer;

    public Question(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }


    public boolean isCorrect(char givenAnswer) {
        return Character.toUpperCase(givenAnswer) == correctAnswer;
    }


    public void display() {
        System.out.println(questionText);
        String[] labels = {"A", "B", "C", "D"};
        for (int i = 0; i < options.length; i++) {
            System.out.println("   " + labels[i] + ") " + options[i]);
        }
    }
}
package quiz;

public class Sporgsmaal implements Translatable {
    private String questionText;
    private int points;
    private String answers[];
    private int rightAnswers;
    private int correctAnswer;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        if(questionText.length()>100) {
                System.out.println("The question is too long!");
                throw new IllegalArgumentException("Spørgsmålet må maks være 100 tegn");
            } else this.questionText = questionText;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        if (points<0){
            throw new IllegalArgumentException("Point skal være større end 0");
        } else this.points = points;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers =answers;
    }

    public int getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(int rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String translate(String language) {
        if (language.equals(Language.DANISH)) {
            return "Oversættelse er ikke muligt endnu desværre!";
        } else if (language.equals(Language.ENGLISH)){
            return "Translation is not available yet, Sorry!";
        }
        return "Language not recognised.";
    }

}

package quiz;

public class Svar implements Translatable {
    private String answerText;
    String answer;


    public String getAnswer() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
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
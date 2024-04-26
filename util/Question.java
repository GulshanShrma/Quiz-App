package util;

/*
 * This class defines an object Question
 */
public class Question {
    private int intId;
    private String strQuestion;
    private String strOption1;
    private String strOption2;
    private String strOption3;
    private String strOption4;
    private String strAnswer;
    public Question(int intId, String strQuestion, String strOption1, String strOption2, String strOption3,
            String strOption4, String strAnswer) {
        this.intId = intId;
        this.strQuestion = strQuestion;
        this.strOption1 = strOption1;
        this.strOption2 = strOption2;
        this.strOption3 = strOption3;
        this.strOption4 = strOption4;
        this.strAnswer = strAnswer;
    }
    public int getIntId() {
        return intId;
    }
    public void setIntId(int intId) {
        this.intId = intId;
    }
    public String getStrQuestion() {
        return strQuestion;
    }
    public void setStrQuestion(String strQuestion) {
        this.strQuestion = strQuestion;
    }
    public String getStrOption1() {
        return strOption1;
    }
    public void setStrOption1(String strOption1) {
        this.strOption1 = strOption1;
    }
    public String getStrOption2() {
        return strOption2;
    }
    public void setStrOption2(String strOption2) {
        this.strOption2 = strOption2;
    }
    public String getStrOption3() {
        return strOption3;
    }
    public void setStrOption3(String strOption3) {
        this.strOption3 = strOption3;
    }
    public String getStrOption4() {
        return strOption4;
    }
    public void setStrOption4(String strOption4) {
        this.strOption4 = strOption4;
    }
    public String getStrAnswer() {
        return strAnswer;
    }
    public void setStrAnswer(String strOption5) {
        this.strAnswer = strOption5;
    }
    @Override
    public String toString() {
        return "Q" + intId + ". " + strQuestion + "\n A) " + strOption1
                + "\t\t B) " + strOption2 + "\n C) " + strOption3 + "\t\t D) " + strOption4;
    }

    
}

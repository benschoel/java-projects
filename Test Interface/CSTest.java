public class CSTest implements Test{
    
    private String topic;
    private int numOfQuestions;
    private double pointsCorrect, pointsIncorrect;
    
    public CSTest(String t, int numOfQ){
        topic = t;
        numOfQuestions = numOfQ;
        pointsCorrect = 3.5;
        pointsIncorrect = .5;
    }
    
    public String getTopic(){
        return topic;
    }
    
    public void setPointsPerQuestion(double pointsCorrect, double pointsIncorrect){
        this.pointsCorrect = pointsCorrect;
        this.pointsIncorrect = pointsIncorrect;
    }
    
    public double calculateScore(int correctResponses, int incorrectResponses){
        return ((correctResponses * pointsCorrect) - (incorrectResponses * pointsIncorrect)) / (numOfQuestions * pointsCorrect);
    }
}
public interface Test{
    public String getTopic();
    public void setPointsPerQuestion(double pointsCorrect, double pointsIncorrect);
    public double calculateScore(int correctResponses, int incorrectResponses);
}
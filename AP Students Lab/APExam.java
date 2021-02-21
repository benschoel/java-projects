public class APExam{
    
    private String mySubject;
    private int myScore;
    
    public APExam(){
        mySubject = "";
        myScore = 1;
    }
    
    public APExam(String s, int sc){
        mySubject = s;
        myScore = sc;
    }
    
    public String getSubject(){
        return mySubject;
    }
    
    public int getScore(){
        return myScore;
    }
}
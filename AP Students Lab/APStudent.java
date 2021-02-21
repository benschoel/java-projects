import java.util.ArrayList;

public class APStudent{
    
    private String myFirstName, myLastName;
    private ArrayList<APExam> myExams = new ArrayList<APExam>();
    
    public APStudent(){
        myFirstName = "";
        myLastName = "";
    }
    
    public APStudent(String first, String last){
        myFirstName = first;
        myLastName = last;
    }
    
    public String getFirstName(){
        return myFirstName;
    }
    
    public String getLastName(){
        return myLastName;
    }
    
    public void setFirstName(String f){
        myFirstName = f;
    }
    
    public void setLastName(String l){
        myLastName = l;
    }
    
    public ArrayList<APExam> getExams(){
        return myExams;
    }
    
    public void addExam(APExam a){
        myExams.add(a);
    }
    
    public double computeExamAverage(){
        double total = 0;
        for(APExam e : myExams){
            total += e.getScore();
        }
        total /= myExams.size();
        return total;
    }
    
    public int findHighestExamScore(){
        int max = -1;
        for(APExam e : myExams){
            if(e.getScore() > max){
                max = e.getScore();
            }
        }
        return max;
    }
    
    public int numberOfFives(){
        int fiveCount = 0;
        
        for(APExam e : myExams){
            if(e.getScore() == 5){
                fiveCount++;
            }
        }
        
        
        return fiveCount;
    }
}
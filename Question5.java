// -----------question---------
//  ->    Map-givan a map of students ID and their list of score . Calculate 
//        the Total Score of each Student

//        Student Id                score
//        1                       [10,20,10]
//        2                       [10,20,11]



// ----------------solution--------------
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        HashMap<Integer,List<Integer>> Data=new HashMap<>();
        Data.put(1, Arrays.asList(10,20,10));
        Data.put(2, Arrays.asList(10,20,11));
        int total=0;
        System.out.println("studentId    TotalMarks");
        System.out.println("---------------------------");
        for(Map.Entry<Integer,List<Integer>> data:Data.entrySet()){
            int studentId=data.getKey();
            List<Integer> marks=data.getValue();
            for(int subMarks:marks){
                total+=subMarks;
            }
            System.out.println(studentId+"          :       "+total);
            total=0;
        }
    }
    
}



// --------------output-------------
// studentId    TotalMarks
// ---------------------------
// 1          :       40
// 2          :       41
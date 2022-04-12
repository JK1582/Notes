import java.util.ArrayList;
import java.util.List;

public class ProgramingComp{
    public static void main(String args[]){
        System.out.println(countSequences(""));
}


public static int countSequences(String input){
    List<Integer> myList = new ArrayList<Integer>();
    for (int i=0;i<input.length();i++){
        int temp =Integer.parseInt(input.substring(i, i+1));
        myList.add(temp);
    }
    int answer=1;
    int stream=0;
    for(int i = 1; i < myList.size(); i++) {  
        int first=myList.get(i-1);
        int second=myList.get(i);
        if (second==(first+1))
            answer++;
        else if (answer==1)
            return 0;
        else if (answer>1){
            stream++;
            answer=1;
            
        }
    }
    if (answer>1)
        stream++;
    return stream;  
    //int String.valueOf(Arr)
}

}

package listdemo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> userAgeList = new ArrayList<>();
                    
        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        userAgeList.add(2, 51);
        
        System.out.println(userAgeList.size());
        userAgeList.remove(3);          
        System.out.println(userAgeList.contains(12));        
        System.out.println(userAgeList.indexOf(12));        
        System.out.println(userAgeList.get(2));
        
        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);        
        System.out.println(userAgeArray[0]);
    
        System.out.println(userAgeList);
                
    }    
}

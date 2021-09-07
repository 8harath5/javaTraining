import java.util.ArrayList;

public class Conditionals{

    public static ArrayList<String> conditionFunc(int ...varinput){
        int len = varinput.length;
        ArrayList<String> array = new ArrayList<String>(len);
        for( int i:varinput){
            if(i>=1 && i<=10){
                switch(i){
                    case 1 : array.add("One");
                              break;
                    case 2 : array.add("Two");
                              break;
                    case 3 : array.add("Three");
                              break;
                    case 4 : array.add("Four");
                              break;
                    case 5 : array.add("Five");
                              break;
                    case 6 : array.add("Six");
                              break;
                    case 7 : array.add("Seven");
                              break;
                    case 8 : array.add("Eight");
                              break;
                    case 9 : array.add("Nine");
                              break;
                    case 10 : array.add("Ten");
                              break;
                }
            }
            else if (i%2==0){
                array.add("Even Beyond");
            }
            else{
                array.add("Odd Beyond");
            }
        }


        return array;
        
    }
    public static void main(String[] args) {
        System.out.println(conditionFunc(1,4,2,6,-2));    
    }
}
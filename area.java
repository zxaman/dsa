import java.util.*;
public class area {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println(area);
    }
}

/*
    now you must be thinking that why i have written 3.14f why that f is written over there
    because in java if you are writng a decimal value it will take that decimal value to double by default
    but in the code i have already taken the radius and the area value to be in float so i have written  that f with 3.14 
*/

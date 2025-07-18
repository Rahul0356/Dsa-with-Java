import java.util.*;

public class breaks{
    public static void main(String arg[]){
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");

    }
}
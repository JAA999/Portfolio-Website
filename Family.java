import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;
public class Family {
 public static void main(String [] args)throws IOException{
    File f = new File("family.dat");
    Scanner s = new Scanner(f);
    int x = 0;
    while(s.hasNext()){
        String s1 = s.nextLine().trim();
        String [] blank = null;
        blank = s1.split(" ");
        String [] first = new String[7];
        if ((blank[1].toString() == "FATHER" || blank[1] == "MOTHER") && x < 1){
            first[x] = blank[0];
            System.out.println(first);
            x++;
        }else if(blank[1]== "SIBLING" && (blank[0] == first[0] || blank[2] == first[0])){

        }
        //System.out.println(s1);
    }
 }   
}

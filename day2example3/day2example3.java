package day2example3;
import java.util.Scanner
public class day2example3 {
    public static <rno> void main(String[] args) {
        Scanner sc =new Scanner(System.in)
        int nreverse =0;
        while ( rno !=0){
            nreverse =(nreverse * 10) + (rno % 10);
            rno = nreverse/ 10;
        }
        return nreverse;
    }
}
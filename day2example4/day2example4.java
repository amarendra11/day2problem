public class day2example4 {
    public static void main(String[] args) {
        char w = 'q';

        switch (w){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(w +"is vowel");
                break;
            default:
                System.out.println(w +"is consonent");
        }
    }
}

import java.util.Arrays;

public class String_Anagram_Check {
    public static void main(String[] args) {
        String s="Rajat";
        String s1="tajar";

        s=s.trim().replaceAll(" +","").toLowerCase();
        s1=s1.trim().replaceAll(" +","").toLowerCase();

        if (s.length()==s1.length()){
            char s2[]=s.toCharArray();
            char s3[]=s1.toCharArray();

            Arrays.sort(s2);
            Arrays.sort(s3);

            String s4=Arrays.toString(s2);
            String s5= Arrays.toString(s3);

            if (s4.equals(s5)){
                System.out.println("Strings r anangram");
            }else{
                System.out.println("Same length but not anagram");
            }

        }else {
            System.out.println("Length of 2 strings are not equal, It is not Anagram");
        }
    }
}

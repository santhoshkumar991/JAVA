import java.util.*;

public class StringEqual {
	
	public static void checkString(String s1,String s2){
        char ar1[]=s1.toCharArray();
        char ar2[]=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(String.valueOf(ar1).equals(String.valueOf(ar2)))
            System.out.println("YES");
        else
            System.out.println("NO");      
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String s1=s.next();
        String s2=s.next();
        checkString(s1,s2);
    }

}

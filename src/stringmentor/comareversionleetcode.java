package stringmentor;
import java.util.*;
public class comareversionleetcode {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String str2=sc.next();
        int a=compareVersion(str,str2);

    }
    public  static int compareVersion(String version1, String version2) {
        int b=version1andversion2(version1,version2);
        return  0;

    }
    public static  int version1andversion2(String str1, String str2){
        System.out.println(str1 + " " + str2);
        String [] str3 = str1.split("." ,str1.length());
        String [] str4 = str2.split(".",str2.length());
        int len1= str3.length;
        System.out.println(Arrays.toString(str3));
        int len2= str4.length;
        System.out.println(Arrays.toString(str4));
        int len=0;
        System.out.println(len1 + " " + len2);
        if(len1<len2){
            len = len1;
        }else{
            len=len2;
        }
        for(int i=0;i<len;i++){
            String s1=str3[i];
            String s2 = str4[i];
            s1=removeledingzero(s1);
            s2=removeledingzero(s2);
            int c= s1.compareTo(s2);
            System.out.println(c);
        }

        return 0;
    }
    public  static String removeledingzero(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=0){
                break;
            }
            count++;
        }
        String str1=str.substring(count);
        return str1;
    }
}

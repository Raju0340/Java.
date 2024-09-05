package basic;

public class changeCase {
public static void main(String[] args) {
    String str = "yatiki";
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)>=97) {
               char c =  (char)(str.charAt(i)-32);
				str = str.replace(str.charAt(i), c) ;
			}else{
                char c =  (char)(str.charAt(i)+32);
				str = str.replace(str.charAt(i), c) ;
            }
		}
        System.out.println(str);
}
}

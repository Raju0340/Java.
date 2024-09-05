package basic;

public class substring {
    public static void substrings(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        //to do
        char currChar = str.charAt(idx);
        substrings(str, idx+1, newString+currChar);
        

        // to not to
      substrings(str, idx+1, newString);
        
    }
    public static void main(String[] args) {
        String str = "abc";
        String new1="";
        substrings(str,0,  new1);

    }

}

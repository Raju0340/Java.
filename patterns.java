package basic;

public class patterns {
public static void main(String[] args) {
    for(int r=0;r<5;r++){
        for(int c=0;c<=r;c++){
           
            // if(c==0||r==4||r==c){
            //     System.out.print("* ");
            // }else{
            //     System.err.print("  ");
            // }
           System.out.print("* ");
        }
       System.out.println();
    }
    for(int r=0;r<5;r++){
        for(int c=5;c>r;c--){
           
        //    if(r==0||c==0||r+c==4){
        //     System.out.print("* ");
        //    }else{
        //     System.out.print("  ");
        //    }
        System.out.print("* ");
           
        }
       System.out.println();
    }
}
}

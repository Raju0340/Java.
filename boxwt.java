package oops;

public class boxwt extends box {

    int weight;
    boxwt(int a , int b, int c,int d){
         len = a ;
         bd = b;
         wd=c;
        weight=d;

    }
    boxwt(){
        super();
        weight = 10;

    }
    int volume(){
        return len*bd*weight;
    }

}

package basic;

public class prefixSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        prefix[0] = nums[0];
        for(int i=1;i<len;i++){
            prefix[i] = prefix[i-1]*nums[i];
        }
        suffix[len-1] =nums[len-1];
        for(int j = len-2;j>=0;j--){
            suffix[j]= suffix[j+1]*nums[j];
        }
        for(int i =0;i<len;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        for(int i =0;i<len;i++){
            System.out.print(suffix[i]+" ");
        }
    }

}

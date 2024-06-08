import java.util.*;
public class merge_sort{
    public static int[] ms(int[] arr,int lo,int hi){
        if(lo==hi){
            int[] baseArray=new int[1];
            baseArray[0]=arr[lo];
            return baseArray;
        }
        int mid=(lo+hi)/2;
        int[] fsh=ms(arr,lo,mid);
        int[] ssh=ms(arr,mid+1,hi);
        int[] fsa=mtsa(fsh,ssh);
        return fsa;
    }
    public static int[] mtsa(int[] fsh, int[] ssh){

        int[] res=new int[fsh.length+ssh.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<fsh.length&&j<ssh.length){
            if(fsh[i]<=ssh[j]){
                res[k]=fsh[i];
                i++;
                k++;
            }
            else{
                res[k]=ssh[j];
                j++;
                k++;
            }
        }
        while(i<fsh.length){
            res[k]=fsh[i];
            i++;
            k++;
        }
        while(j<ssh.length){
        res[k]=ssh[j];
        j++;
        k++;
        }
        return res;
    }
    public static void printArr(int[] ansArr){
        for(int val:ansArr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int[] ansArr=ms(arr,0,arr.length-1);
        printArr(ansArr);
        scn.close();
    }
}
public class lastoccurence {
    public static int lastoccur(int a[],int key,int i){
        if(i==a.length-1){
            return -1;
        }
        int isFound=lastoccur(a,key,i+1);
        if(isFound==-1&&a[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[]a={2,3,6,9,5,10,2,5,3};
        System.out.println(lastoccur(a,5,0));
    }
}

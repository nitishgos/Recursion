public class firstoccurence {
    public static int firstoccr(int a[],int key,int i){
        if(i==a.length-1){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstoccr(a,key,i+1);
    }
    public static void main(String[] args) {
        int []a={2,3,6,9,5,10,2,5,3};
        System.out.println(firstoccr(a,5,0));
    }
}

public class sumofnatural {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sn1=sum(n-1);
        int sn=n+sn1;
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(5));
    }
}

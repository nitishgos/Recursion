public class convertstr {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    public static void convrt(int n){
        if(n==0){
            return;
        }
        int r=n%10;
        convrt(n/10);
        System.out.print(digits[r]+"  ");
    }
    public static void main(String[] args) {
        convrt(1947);
    }
}

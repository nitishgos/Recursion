public class friendpair {
    public static int pair(int n){
        if(n==1||n==2){
            return n;
        }
        //single 
        int f1=pair(n-1);
        //pair
        int f2=pair(n-2);
        int totalways=(n-1)*f2;
        int f=f1+totalways;
        return f;
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}

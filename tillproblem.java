public class tillproblem {
    public static int till(int n){ // floor size 2xn
        if(n==1||n==0){
            return 1;
        }
        //vertical choice
        int f1=till(n-1);
        //horizontal choice
        int f2=till(n-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        System.out.println(till(4));
    }
}

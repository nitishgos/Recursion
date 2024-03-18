public class power {
  /*   public static int pow(int n,int x){ // T(n)=O(n)
        if(n==0){
            return 1;
        }
        int p1=pow(n-1,x);
        int p=x*p1;
        return p;
    }*/
    public static int pow(int a,int n){ //T(n)=O(logn)
        if(n==0){
            return 1;
        }
        int halfpow=pow(a,n/2);
        int halfpowsq=halfpow*halfpow;
        if(n%2!=0){
            halfpowsq=a*halfpow*halfpow;
        }
        return halfpowsq;
    }
    public static void main(String[] args) {
        System.out.println(pow(3,2));
    }
}

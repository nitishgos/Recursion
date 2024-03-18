public class binarystring {
    public static void binary(String str,int n,int lastposition){
        if(n==0){
            System.out.println(str);
            return;
        }
        binary(str+"0",n-1,0);
        if(lastposition==0){
            binary(str+"1",n-1,1);
        }
    }
    public static void main(String[] args) {
        binary("",3,0);
    }
}

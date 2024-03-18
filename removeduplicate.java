public class removeduplicate {
    public static void remove(String str,int i,StringBuilder sb,boolean[]map){
        if(i==str.length()){
            System.out.println(sb);
            return;
        }
        char currch=str.charAt(i);
        if(map[currch-'a']==true){
             remove(str,i+1,sb,map);
        }else{
            map[currch-'a']=true;
            remove(str,i+1,sb.append(currch),map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        remove(str,0,new StringBuilder(""),new boolean[26]);
    }
}

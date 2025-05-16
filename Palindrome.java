public class Palindrome {
    public static void main(String[] args){
    System.out.println(isPalidrome("madam"));
    }
    public static boolean isPalidrome(String str){
        if(str==null || str.length()==0){
            return true;
        }
       char [] ch=str.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end){
            if(ch[start]!=ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

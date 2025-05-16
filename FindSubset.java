class FindSubset {
    public static  void findSubsets(String str, String ans, int i){
         //base case
        if ( i == str.length()){
            System.out.println(ans);
            return;
        }
        //recursion starts here
        //yes choice

        findSubsets(str,ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str,ans,i+1);
    }

    //main start here
    public static  void  main(String args[]){
        String str = "abc";
        String ans = "";
        System.out.println("Hello dear");
        findSubsets(str,ans,0);
    }
}
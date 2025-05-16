class Grid {
public static int gridWays(int i, int j, int n, int m) {
    //base case
    if (i == n-1 && j == m-1 ){
        return 1;
    } else if (i == n || j ==n){
        return 0;
    }
     // it is in 2^n time complexity
    //recursion
    int w1 = gridWays(i+1,j,n,m);
    int w2 = gridWays(i, j+1 , n , m);
    return w1+w2;
    }

    public static void main(String args[]){
        System.out.println("Hello world Happy is here");
        int n = 3000, m = 3000;
        System.out.println(gridWays(0,0,n,m));
    }
}
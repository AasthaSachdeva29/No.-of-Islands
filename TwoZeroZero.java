import java.util.LinkedList;
import java.util.Queue;

//public class TwoZeroZero {
//    public  static class Pair{
//        int x;
//        int y;
//
//        Pair(int x,int y){
//            this.x=x;
//            this.y=y;
//
//        }
//    }
//    public  static void bfs(boolean vis[][],char[][] grid,int i,int j){
//        int m= grid.length;
//        int n= grid[0].length;
//        Queue<Pair> q=new LinkedList<>();
//        Pair p=new Pair(i,j);
//        q.add(p);
//        while(!q.isEmpty()){
//            Pair c=q.remove();
//            System.out.println(c.x+"    "+c.y);
//            if(c.x>=0 && c.x<m && c.y-1>=0 && c.y-1<n && grid[c.x][c.y-1]=='1' && vis[c.x][c.y-1]==false){
//                q.add(new Pair(c.x,c.y-1));
//            }
//            if(c.x-1>=0 && c.x-1<m && c.y>=0 && c.y<n && grid[c.x-1][c.y]=='1' && vis[c.x-1][c.y]==false){
//                q.add(new Pair(c.x-1,c.y));
//            }
//            if(c.x+1>=0 && c.x+1<m && c.y>=0 && c.y<n && grid[c.x+1][c.y]=='1' && vis[c.x+1][c.y]==false){
//                q.add(new Pair(c.x+1,c.y));
//            }
//            if(c.x>=0 && c.x<m && c.y+1>=0 && c.y+1<n && grid[c.x][c.y+1]=='1' && vis[c.x][c.y+1]==false){
//                q.add(new Pair(c.x,c.y+1));
//            }
//            vis[c.x][c.y]=true;
//        }
//    }
//    public static int numIslands(char[][] grid) {
//        int m= grid.length;
//        int n= grid[0].length;
//        boolean vis[][]=new boolean[m][n];
//        int c=0;
//
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(vis[i][j]==false && grid[i][j]=='1'){
//                    c++;
//                    bfs(vis,grid,i,j);
//                }
//            }
//        }
//        return c;
//    }
//
//    public static void main(String[] args) {
////        char grid[][] = {
////                {'1', '1', '1', '1', '0'},
////                {'1', '1', '0', '1', '0'},
////                {'1', '1', '0', '0', '0'},
////                {'0', '0', '0', '0', '0'}
////        };
//        char grid[][] ={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
//        System.out.println(numIslands(grid));
//    }
//}



import java.util.LinkedList;
import java.util.Queue;

public class TwoZeroZero {
    public  static class Pair{
        int x;
        int y;

        Pair(int x,int y){
            this.x=x;
            this.y=y;

        }
    }
    public  static void bfs(boolean vis[][],char[][] grid,int i,int j){
        int m= grid.length;
        int n= grid[0].length;
        //    // Queue<Pair> q=new LinkedList<>();
        //     Pair p=new Pair(i,j);
        //     // q.add(p);
        //     // while(!q.isEmpty()){
        //         Pair c=q.remove();
        if(i>=0 && i<m && j-1>=0 && j-1<n && grid[i][j-1]=='1' && vis[i][j-1]==false){
            // q.add(new Pair(c.x,c.y-1));
            bfs(vis,grid,i,j-1);

        }
        if(i-1>=0 && i-1<m && j>=0 && j<n && grid[i-1][j]=='1' && vis[i-1][j]==false){
            //  q.add(new Pair(c.x-1,c.y));
            bfs(vis,grid,i-1,j);
        }
        if(i+1>=0 && i+1<m && j>=0 && j<n && grid[i+1][j]=='1' && vis[i+1][j]==false){
            //q.add(new Pair(c.x+1,c.y));
            bfs(vis,grid,i+1,j);
        }
        if(i>=0 && i<m && j+1>=0 && j+1<n && grid[i][j+1]=='1' && vis[i][j+1]==false){
            //  q.add(new Pair(c.x,c.y+1));
            bfs(vis,grid,i,j+1);
        }
        vis[i][j]=true;
        // }
    }

    public static int numIslands(char[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int c=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==false && grid[i][j]=='1'){
                    c++;
                    bfs(vis,grid,i,j);
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
//        char grid[][] = {
//                {'1', '1', '1', '1', '0'},
//                {'1', '1', '0', '1', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '0', '0', '0'}
//        };
        char grid[][] ={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println(numIslands(grid));
    }
}


package other_channels;

import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class First_testG {
    public static void main(String[] args) {
//        int [][] island={
//                {1, 1, 1, 1, 0},
//                {1, 1, 0, 1, 0},
//                {1, 1, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//        };
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        int[][] island_DFS =new int[row][column];
        int[][] island_BFS =new int[row][column];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                island_DFS[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                island_BFS[i][j]=island_DFS[i][j];
            }
        }
        System.out.println(DFS(island_DFS));
        System.out.println(BFS(island_BFS));
    }
    public static int BFS(int[][] island){
        int count=0;
        int up,down,left,right;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<island.length;i++){
            for (int j=0;j<island[i].length;j++){
                if(island[i][j]==0){
                    continue;
                }
                queue.add(i);
                queue.add(j);
                while(queue.peek()!=null){
                    int ti=queue.remove();
                    int tj=queue.remove();
                    island[ti][tj]=0;
                    if(ti>0&&island[ti-1][tj]==1){
                        queue.add(ti-1);
                        queue.add(tj);
                    }
                    if(ti<island.length-1&&island[ti+1][tj]==1){
                        queue.add(ti+1);
                        queue.add(tj);
                    }
                    if(tj>0&&island[ti][tj-1]==1){
                        queue.add(ti);
                        queue.add(tj-1);
                    }
                    if(tj<island[ti].length-1&&island[ti][tj+1]==1){
                        queue.add(ti);
                        queue.add(tj+1);
                    }

                }
                count++;


            }
        }
        return count;
    }

    public static void DFSImpl(int[][] island,int i,int j){
        if(i<0||i>=island.length||j<0||j>=island[i].length){
            return;
        }
        if(island[i][j]==0)
            return;
        island[i][j]=0;
        DFSImpl(island,i-1,j);
        DFSImpl(island,i+1,j);
        DFSImpl(island,i,j-1);
        DFSImpl(island,i,j+1);

    }
    public static int DFS(int[][] island){
        int count=0;
        for (int i=0;i<island.length;i++){
            for (int j=0;j<island[i].length;j++){
                if(island[i][j]==0)
                    continue;
                DFSImpl(island,i,j);
                count++;
            }
        }
        return count;
    }
}

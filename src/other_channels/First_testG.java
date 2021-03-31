package other_channels;

import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//给定一个由'1'（陆地）和'0'（海洋）组成的二维网格。计算岛屿的数量?（要求：CPU消耗 < 1000ms）其中：
//一个岛屿指其水平和垂直方向上相邻的区域均是陆地连接而成的
//假设网格的四个边界均被海洋包围

//输入：grid = [
//        ['1', '1', '1', '1', '0'],
//        ['1', '1', '0', '1', '0'],
//        ['1', '1', '0', '0', '0'],
//        ['0', '0', '0', '0', '0'],
//    ]
//输出：1

//思路：简单的DFS遍历
//DFS：判定好边界值，遇到1时不断遍历，并不断把1变成0
//BFS：用队列保存数组的i和j的值，每当有1时i，j入队，然后i，j出队并保存他们的值
//判断好四个方向的条件，
//DFS会回溯，BFS是找到一个点就直接标记这个点，然后不断向四周找，不会回溯。
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

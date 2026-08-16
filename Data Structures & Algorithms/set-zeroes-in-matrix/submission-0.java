class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<int[]> q=new LinkedList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] temp=q.poll();
            for(int i=0;i<n;i++){
                matrix[temp[0]][i]=0;
            }
            for(int i=0;i<m;i++){
                matrix[i][temp[1]]=0;
            }
        }
    }
}

class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        if(arr[start]==0) return true;
        boolean[] visited = new boolean[n];
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            int left = curr-arr[curr];
            if(left >= 0 && !visited[left]){
                if(arr[left]==0) return true;
                visited[left] = true;
                queue.offer(left);
            }

            int right = curr+arr[curr];
            if(right < n && !visited[right]){
                if(arr[right]==0) return true;
                visited[right] = true;
                queue.offer(right);
            }
        }
        return false;
    }
}
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for(int[] ob : obstacles){
            set.add(ob[0] +","+ob[1]);
        }
        // West 0 North 1 East 2 South 3
        int currD = 1; // North
        int startX = 0;
        int startY = 0;
        int currX = startX;
        int currY = startY;
        int maxDist = 0;
        for(int comm : commands){
            if(comm==-1){
                currD = (currD+1)%4;
            }
            else if(comm==-2){
                currD = (currD+3)%4;
            }
            else{
                // move
                int step = comm;
                for(int i=0;i<step;i++){
                    if(currD == 1){
                        if(set.contains(currX+","+(currY+1))){
                            break;
                        }
                        currY++;
                    }
                    if(currD == 2){
                        if(set.contains((currX+1)+","+currY)){
                            break;
                        }
                        currX++;
                    }
                    if(currD == 3){
                        if(set.contains(currX+","+(currY-1))){
                            break;
                        }
                        currY--;
                    }
                    if(currD == 0){
                        if(set.contains((currX-1)+","+currY)){
                            break;
                        }
                        currX--;
                    }
                    maxDist = Math.max(maxDist,currX*currX+currY*currY);
                }
            }
        }
        return maxDist;
    }
}
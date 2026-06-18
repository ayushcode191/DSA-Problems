class Solution {
    public double angleClock(int hour, int minutes) {
        
        double angle = Math.abs((((double) minutes/60)*30 + (hour%12)*30) - minutes*6);
        return Math.min(angle,360-angle);
    }
}
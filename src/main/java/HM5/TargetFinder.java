package HM5;

class TargetFinder{
    public int[] findTarget(int[] aiCoords, int[][] targets){
        int [] distances = new int[1];
        double minDistance = this.getDistance(aiCoords[0], aiCoords[1], targets[0][0], targets[0][1]);
        for (int[] target: targets) {
            double temp = this.getDistance(aiCoords[0], aiCoords[1], target[0], target[1]);
            if(temp < minDistance){
                distances = target;
                minDistance = temp;
            }
        }
        return distances;
    }

    public double getDistance(int x1, int y1, int x2, int y2){
        double intermediateResult = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        return Math.sqrt(intermediateResult);
    }
}

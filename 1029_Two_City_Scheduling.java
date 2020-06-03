class Solution {
    public int twoCitySchedCost(int[][] costs) {
        // We are sorting by the difference between two costs
        Arrays.sort(costs,(a,b) -> {
            return (a[0] - a[1]) - (b[0] - b[1]);
        });
        int tot_cost = 0;
        for(int i=0; i<costs.length/2; i++){
            cost = cost + costs[i][0];
        }
        
        for(int i=costs.length/2; i<costs.length; i++){
            cost = cost + costs[i][1];
        }
        return tot_cost;
    }
}

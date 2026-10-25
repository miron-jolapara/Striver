class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int low = k - 1;
        int high = cardPoints.length - 1;
        int score = 0;

        for (int i = 0; i < k; i++) {
            score += cardPoints[i];
        }

        int maxScore = score;

        while (low >= 0) {
            score -= cardPoints[low];
            score += cardPoints[high];

            maxScore = Math.max(maxScore, score);

            low--;
            high--;
        }

        return maxScore;
    }
}
public class SelectionSort {
    public  static void main(String[] args){
        int[] scores = {76 , 80 , 90, 66,75 , 77 };
        for(int i = 0 ; i<scores.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length-1 ; j++){
                if(scores[j]<scores[minIndex]){
                    minIndex = j;
                }

            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
        System.out.println("sorted exam scores");
        for (int score: scores){
            System.out.println(score+ " ");
        }
    }

}

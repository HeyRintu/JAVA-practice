public class ArrayExercise {

    public static void main(String[] args) {

        //declare int Array
        int[] exerciseArray = {4, 5, 5, 8, 6, 45, 12, 74, 25};

        //print array elements
        for (int i = 0; i < exerciseArray.length; i++){
            System.out.println(i + "th element is : " + exerciseArray[i]);
        }


        //finding the largest number
        int largest = exerciseArray[0];
        for (int i = 0; i < exerciseArray.length; i++){
            if (exerciseArray[i] > largest){
                largest = exerciseArray[i];
            }
        }
        System.out.println("The largest number is : " + largest);


        //sum up all elements
        int sum = 0;
        for (int i = 0; i < exerciseArray.length; i++){
            sum += exerciseArray[i];
        }
        System.out.println("The sum of the all array elements are : " + sum);

    }
}

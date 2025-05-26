public class SquareArrays {

  static void ArraySquare(int[] arr) {
    
    for (int i = 0; i < arr.length - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[smallest]) {
          smallest = j;
        }
      }

      
      int temp = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = temp;
    }

    
    for (int i = 0; i < arr.length; i++) {
      int square = arr[i] * arr[i];
      System.out.println(square);
    }
  }

  public static void main(String[] args) {
    int[] numbers = {9, 2, 7, 0, 5};
    ArraySquare(numbers[i]);
  }
}

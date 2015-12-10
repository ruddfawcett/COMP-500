public class OneDimensional {
  public static void main(String[] args) {
    int[] nums = {
      5,
      6,
      8
    };

    // display the array

    // for (int i : nums) {
    //   System.out.println(i);
    // }

    System.out.print("ints: ");
    print(nums);

    // find the sum

    System.out.println();

    int sum = 0;
    for (int i : nums) {
      sum += i;
    }
    System.out.printf("Sum: %d", sum);
    System.out.println();

    // reverse the array

    System.out.print("Reverse: ");
    for (int k = nums.length-1; k >= 0; k--) {
      System.out.print(nums[k]+", ");
    }

    // sort

  }

  public static void print(int[] x) {
    for (int y : x) {
      System.out.print(y + " ");
    }
  }
}

class Main {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    int x = 0; //start loop pointer
    int j = nums.length-1; //end loop pointer
    
    //if end pointer elelment is zero, move left until it's value is //not zero
    while(j == 0){
      j--;
    }
    //need to loop this
    while(x<j){
    //determine if element is zero
      if (nums[x] == 0){
      /*moving elements pointer = i
      for loop moves each element to the left & places zero in last spot
      */
        for (int i = x; i<j; i++){
          nums[i] = nums[i+1];    
      }
        nums[j] = 0;
        j--;
      }
      //if start loop element isn't 0, move pointer to right
      else if (nums[x] != 0){
        x++;
      }
      for (int i = 0; i<nums.length; i++){
        System.out.println("nums "+i+ " is now "+nums[i]);
      }
      System.out.println();
    }
  }//main
}//class
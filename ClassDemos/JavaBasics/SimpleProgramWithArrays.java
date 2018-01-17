class SimpleProgramWithArrays {
	
   public static void main(String[] args) {
      // array of int	
      int[] nArr = new int[5];
      nArr[0] = 12;
      nArr[1] = 13;
      for(int i=0; i<nArr.length; ++i) {
         System.out.println(nArr[i]);
      }
	
      // array of strings
      String[] sArr = new String[2];
      sArr[0] = "Zebra";
      sArr[1] = "Unicorn";
      for(int i=0; i<sArr.length; i++) {
          System.out.println(sArr[i]);
      }
   }     
}

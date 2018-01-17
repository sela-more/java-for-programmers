class CopyArrays {
	
    public static void main(String[] srgs) {
                int[] sArray = { 101, 102, 103, 104 };
                int[] dArray = { 2, 4, 6, 8, 10, 12 };
                System.arraycopy(sArray, 1, dArray, 3, 2);
	
                for(int i=0; i<dArray.length; ++i) {
                   System.out.print(" " + dArray[i]);
        }
    }     
}

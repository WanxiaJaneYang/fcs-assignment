public class HandlingArrays {
    public static void printArray(double[] testArray){
        if(testArray.length==0){
            return;
        }

        System.out.print("[");
        for(int i=0; i<testArray.length;i++){
            System.out.printf("%.1f",testArray[i]);
            if(i!=testArray.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    //method to print an array

    public static double[] divElements(double[] array, double[] factors){
        if(array.length==0||factors.length==0){
            return null;
        }else if(array.length!=factors.length){
            throw new RuntimeException("Error - Arrays different shape");
        }else{
            for(int i=0;i<array.length;i++){
                array[i]=array[i]/factors[i];
            }
            return array;
        }
    }
    //method to divide an array by another array

    public static int peakArrays(double[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(i!=0 && array[i]>array[i-1] && i!=array.length-1 && array[i]>array[i+1]){
                System.out.println("element "+i+" ("+array[i]+") is a peak");
                count++;
            }
        }
        return count;
    }
    //method to find the peak element in an arra
}

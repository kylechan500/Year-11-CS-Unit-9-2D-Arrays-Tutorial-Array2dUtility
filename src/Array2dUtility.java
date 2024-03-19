
public class Array2dUtility {

  
    public static void print(int[][] array){

        for(int[] oneD: array){
            for(int a: oneD){
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }

  
    public static int sum(int[][] array){

        int count = 0;

        for(int[] oneD: array){
            for(int a: oneD) {
                count += a;
            }
        }

        return count;

    }

  

    public static double average(int[][] array){

        int count = 0;
        int total = 0;

        for(int[] oneD: array){

            for(int a: oneD) {

                count += a;
                total++;


            }

        }

        return (double) count / total;

    }

  
    public static int minimum(int[][] array){

        int min = array[0][0];

        for(int[] oneD: array){
            for(int a: oneD) {

                if(a < min){
                    min = a;
                }

            }
        }

        return min;

    }

 
    public static int maximum(int[][] array){


        int max = array[0][0];

        for(int[] oneD: array){
            for(int a: oneD) {

                if(a > max){
                    max = a;
                }

            }
        }

        return max;

    }

    public static int evenCountStandard(int[][] array){

        int count = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++) {

               if(array[i][j] % 2 == 0){

                   count++;

               }

            }
        }

        return count;

    }

  
    public static int evenCountEnhanced(int[][] array){

        int count = 0;

        for(int[] oneD: array){
            for(int a: oneD) {

                if(a % 2 == 0){

                    count++;

                }

            }
        }

        return count;

    }

  
    public static boolean allPositive(int[][] array){


        for(int[] oneD: array){
            for(int a: oneD) {

                if(a < 0){

                    return false;

                }

            }
        }

        return true;

    }


    public static int[] rowSums(int[][] array){

        int[] temp = new int[array.length];

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array[i].length; j++){

                temp[i] += array[i][j];

            }

        }

        return temp;
        
    }
    
    public static int[] colSums(int[][] array){

        int i = 0;

        for(int[] oneD: array){

            if(oneD.length > i){

                i = oneD.length;

            }

        }

        int[] temp = new int[i];

        for(int a = 0; a < array.length; a++){

            for(int j = 0; j < array[a].length; j++){

                temp[j] += array[a][j];

            }

        }

        return temp;
    }

}

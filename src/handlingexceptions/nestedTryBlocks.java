package handlingexceptions;

public class nestedTryBlocks {

    public static void main(String[] args) {
        try {
            try {
                try {
                    int arr[] = {1,2,3,4};
                            System.out.println(arr[10]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBounds Exception block 3");
                    throw e;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBounds Exception block 2");
                throw e;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception block 1");
            throw e;
        }
    }
}

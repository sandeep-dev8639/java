public class RemovingDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,1,4,5};
        int num = arr.length;
        int temp[] = new int[num];
        int j = 0;

        try{

            for(int i=0 ; i<=num-1 ; i++){
                if(arr[i] != arr[i+1]){
                    temp[j]=arr[i];
                    j++;
                }
            }
            temp[j] = arr[num-1];
            System.out.println("after remove");
            for(int i=0;i<=j;i++){
                System.out.println(temp[i] + " ");
            }
        }
        catch(Exception e){
            System.out.println("please give the correct size of an array");
        }
    }
}

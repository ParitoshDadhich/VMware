
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int P)
    {
        for(int i=0; i<n; i++)
            arr[i] -= 1;
        
        for(int i=0; i<n; i++){
            arr[arr[i]%n] = arr[arr[i]%n] + n;
        }
        
        for(int i=0; i<n; i++)
            arr[i] =arr[i]/n;
    }
}

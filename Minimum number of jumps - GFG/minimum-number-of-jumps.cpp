// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
// Function to return minimum number of jumps to end of array

class Solution{
  public:
    int minJumps(int arr[], int n){
        // Your code here
        int jump =0;
        int cur =0;
        int i=0;
        int count =0;
        
        while(i<n-1)
        {
            if (i+arr[i]> jump)
           {
               jump = i+arr[i];
           }
            if(i==cur)
            {
                count++;
                cur = jump;
            }
            if(arr[i]==0 && i==jump)
            return -1;
           i++; 
        }
        return count;
    }
    
};


// { Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,i,j;
        cin>>n;
        int arr[n];
        for(int i=0; i<n; i++)
            cin>>arr[i];
        Solution obj;
        cout<<obj.minJumps(arr, n)<<endl;
    }
    return 0;
}
  // } Driver Code Ends
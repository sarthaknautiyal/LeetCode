class Solution {
    public int minimumLength(String s) {

            char[] arr = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n-1;

        while(i<j && arr[i] == arr[j]){
            char ch = arr[i];

            while(i<j && arr[i] == ch){
                i++;
            }

            while(j>=i && arr[j] == ch){
                j--;
            }

        }

        return j-i+1;

    }
}
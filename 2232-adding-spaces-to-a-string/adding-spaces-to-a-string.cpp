class Solution {
public:
    string addSpaces(string s, vector<int>& spaces) {
        int n=s.size();
        int m=spaces.size();
        string ans="";
        int i=0,j=0;
        while(i<n){
            if(j<m && i==spaces[j]){
                ans+=" ";
                j++;
            }
            ans+=s[i];
            i++;
        }

        return ans;

    }
};
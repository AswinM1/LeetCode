class Solution {
public:
    long long findScore(vector<int>& nums) {
    vector<pair<int,int>>v;
    long score=0;
    int n=nums.size();
    vector<long>mark(n,0);
    for(int i=0;i<n;i++)
    {
       
        v.push_back({nums[i],i});
    }
    sort(v.begin(),v.end());
    
    for(int i=0;i<mark.size();i++)
    {
        if(mark[v[i].second]!=1)
        {
          
                mark[v[i].second]=1;
            

           
            if(v[i].second-1>=0)
            {

            mark[v[i].second-1]=1;
            }
            if(v[i].second+1<mark.size())
            {
            mark[v[i].second+1]=1;

            }
            

            score+=v[i].first;
        }
            
        }
    
return score;

        
    }
};
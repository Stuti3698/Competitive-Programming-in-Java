class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        //only 0 and 1 
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Solution s=new Solution();
        int res=s.findMaxLength(arr);
        System.out.println(res);
    }
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> counts=new HashMap();
        counts.put(0,-1);
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count+=-1;
            }
            else{
                count+=1;
            }
            if(counts.containsKey(count)){
                max=Math.max(max,i-counts.get(count));
            }
            else{
                counts.put(count,i);
            }

        }
        return max;
    }
}

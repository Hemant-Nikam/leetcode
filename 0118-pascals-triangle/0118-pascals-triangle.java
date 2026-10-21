class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1)));

        for(int i = 1 ; i < numRows ; i++)
        {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);

            int j = 0 ;
            while( j <= i - 2 )
            {
                list1.add(list.get(i - 1).get(j) + list.get(i -1).get(j + 1));
                j++;

            }
            list1.add(1); 

            list.add(list1);
        }
        return list;
    }
}
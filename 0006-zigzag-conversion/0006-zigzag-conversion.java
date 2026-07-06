class Solution {
    public String convert(String s, int numRows) {
        int ysize = 0;
        int cnt = s.length();
        boolean flag = false;
        int tempx = 0;
        while(cnt > 0){
            if(!flag){
                cnt = cnt - numRows;
                ysize++;
                tempx = numRows - 1;
                flag = true;
                
            }
            else{
                if(tempx == 0){
                    flag = false;
                }
                else{
                    tempx--;
                    ysize++;
                    cnt = cnt - 1;
                    System.out.println("ysize: " + ysize);
                }
            }
            System.out.println("cnt: " + cnt);
        }
        System.out.println("ysize: " + ysize);
        System.out.println("xsize: " + numRows);
        // Map<charCharacter,Integer> map = new HashMap<>();
        char arr[][] = new char[999 ][999];
        int i = 0;
        int x = 0 ;
        int y = 0 ;
        boolean up = false;
        boolean side = false;
        if(numRows == 1){
            return s;
        }
        while(i < s.length()){
            char c = s.charAt(i);
            arr[x][y] = c;

            if(!up){
                x++;
            }
            else{
                x--;
            }
            if(!side){
                
            }else{
                y++;
            }
            if(x == numRows - 1){
                up = true;
                side = true;
            }
            if(x == 0){
                up = false;
                side = false;
            }

            i++;
        }
        return printArray(arr ,numRows, y);
    }
    public String printArray(char a[][] ,int x,int y){
        String ans="";
        for(int i = 0 ; i <= x ; i++){
            for(int j = 0 ; j <= y ; j++){
                if(a[i][j] != '\0'){
                    ans = ans +""+ a[i][j] + "";
                }
                else{
                    ans = ans;
                }
            }
        }
        return ans;
    }
}
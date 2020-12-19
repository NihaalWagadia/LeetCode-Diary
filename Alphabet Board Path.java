class Solution {
    public String alphabetBoardPath(String target) {
        Map<Character, int[]>hm = new HashMap<>();
        hm.put('a',new int[]{0,0});
        hm.put('b',new int[]{0,1});
        hm.put('c',new int[]{0,2});
        hm.put('d',new int[]{0,3});
        hm.put('e',new int[]{0,4});
        hm.put('f',new int[]{1,0});
        hm.put('g',new int[]{1,1});
        hm.put('h',new int[]{1,2});
        hm.put('i',new int[]{1,3});
        hm.put('j',new int[]{1,4});
        hm.put('k',new int[]{2,0});
        hm.put('l',new int[]{2,1});
        hm.put('m',new int[]{2,2});
        hm.put('n',new int[]{2,3});
        hm.put('o',new int[]{2,4});
        hm.put('p',new int[]{3,0});
        hm.put('q',new int[]{3,1});
        hm.put('r',new int[]{3,2});
        hm.put('s',new int[]{3,3});
        hm.put('t',new int[]{3,4});
        hm.put('u',new int[]{4,0});
        hm.put('v',new int[]{4,1});
        hm.put('w',new int[]{4,2});
        hm.put('x',new int[]{4,3});
        hm.put('y',new int[]{4,4});
        hm.put('z',new int[]{5,0});
        Set<String>set = new HashSet<>(Arrays.asList("51","52","53","54"));
        
        int move_x=0;
        int move_y=0;
        String str = "";
        for(int i=0; i<target.length(); i++){
            int[] arr = hm.get(target.charAt(i));
            int x = arr[0];
            int y = arr[1];
            while(move_x!=x || move_y!=y){
                
                if(move_x<x && !set.contains(String.valueOf(move_x +1) + String.valueOf(move_y))){
                    move_x++;
                    str += "D";
                }
                else if(move_x>x){
                    move_x--;
                    str += "U";
                    }
                else if(move_y<y){
                    move_y++;
                    str += "R";
                }
                else if(move_y>y){
                    move_y--;
                    str += "L";
                    }
            }
            str += "!";
        }
        return str;
    }
}

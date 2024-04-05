class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i=0;i<bits.length;){
            switch(bits[i]){
                case 0 : i++; if(i==bits.length){return true;} break;
                case 1 : i+=2; if(i==bits.length){return false;}
            }
        }
        return false;
    }
}
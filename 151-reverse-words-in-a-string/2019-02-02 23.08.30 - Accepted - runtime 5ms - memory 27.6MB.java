public class Solution {
     public String reverseWords(String s) {
        char[] a = s.toCharArray();
        reverse(a,0,a.length-1);

        int end = 0;
        int start = 0;
        while((end=findSpace(a,start))!=-1){
            reverse(a,start,end-1);
            start = end+1;
            while(start<a.length && a[start]==' ') start++;
        }
        reverse(a,start,a.length-1);

        System.out.println(a);
        return cleanWord(a);
    }

    public String cleanWord(char[] a){
        int i=0,j=0;
        int len=a.length;
        while(j<len) {
            while (j < len && a[j] == ' ') j++; //skip spaces
            while (j < len && a[j] != ' ') a[i++] = a[j++]; //keep non spaces
            while (j < len && a[j] == ' ') j++; //skip spaces
            if (j < len) a[i++] = ' ';
        }
        return new String(a,0,i);

    }

    public int findSpace(char[] a, int start){
        for(int i=start;i<a.length;i++){
            if(a[i]==' ') return i;
        }
        return -1;
    }

    public void reverse(char[] a, int start,int end){
        int i = start;
        int j = end;
        char tmp;
        while (i<j){
            tmp = a[i];
            a[i]= a[j];
            a[j]=tmp;
            i++;j--;
        }
    }

}
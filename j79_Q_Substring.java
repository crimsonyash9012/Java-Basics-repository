public class j79_Q_Substring {
    public static void printSubstring(String S, int index, String temp ){
        if(!temp.isEmpty()){
            System.out.print(temp + " ");
        }
        if(index == S.length()){
            return;
        }
        if(temp.isEmpty()){
            printSubstring(S,index+1,temp);
            printSubstring(S,index+1,temp + S.charAt(index));
        }
        printSubstring(S,index+1,temp + S.charAt(index));

    }
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print(s.substring(i,j+1) + ", ");
            }
        }

        System.out.println();

        printSubstring("abc", 0, "");
    }
    
}

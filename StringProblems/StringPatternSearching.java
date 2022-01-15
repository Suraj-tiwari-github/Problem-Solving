package ProblemSolving.StringProblems;

public class StringPatternSearching {

    public static void patternSearch(String txt, String pat){
        //* here we'll use indexOf method to search for a character, Its written index value, if the first character
        //* is not present in the string, then it returns -1.

        int pos=txt.indexOf(pat);
        int index=pos;
        //* now we are going to find the next occurrences of the string.
        while(pos>=0){
            System.out.println(pos);
            pos=txt.indexOf(pat,pos+1);
        }

        for(int i=index; i<txt.length(); i++){
            System.out.print(txt.charAt(i) );
        }
    }

    public static String gfgPatternSearch(String txt, String pat){
        int pos=txt.indexOf('.');

        if(pos<0){
            return "";
        }
        else
            return txt.substring(pos+1);
    }
    public static void main(String[] args) {

        String txt="19.385";
        String pat="385";
//        patternSearch(txt,pat);
        System.out.println(gfgPatternSearch(txt,pat));
    }
}

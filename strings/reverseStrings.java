package strings;

public class reverseStrings {
    public static String reversePreserveSpaces(String str) {
        
        char[] arr = str.toCharArray();
        char[] orig = str.toCharArray();
        
        for (int i = 0, j= orig.length-1; i<j; i++, j--) {
            char temp = orig[i];
            orig[i] = orig[j];
            orig[j] = temp;
        }
        
        System.out.print("Original string = ");
        System.out.println(arr);

        System.out.print("reversed string in array form = ");
        System.out.println(orig);

        String revStr = String.valueOf(orig);
        System.out.println("reversed string in string form = "+revStr);

        revStr = revStr.replaceAll("\\s+","");
        System.out.println("reversed string after removing all the spaces = "+revStr);
        
        // convert string to mutable form so that we can insert spaces in it at the desired locations
        StringBuilder Str2 = new StringBuilder(revStr);
      
        for (int i = 0; i< orig.length; i++) {
            if ( arr [i]== ' ')
                Str2.insert(i, ' ');
        }
        return(String.valueOf(Str2));
        //        System.out.println("Reversed String after preserving spaces = "+Str2);
    }        
}

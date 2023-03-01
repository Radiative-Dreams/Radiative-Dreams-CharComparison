public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        //the for loop will decide if the two are different
        for(int i = 0; i< b.length || i<a.length; i++)
        {
            if(a[i] < b[i]) return -1;
            else if( a[i] > b[i]) return 1;
        }
        // then have a return 0 if they are the same length since they are the same
        // else return -1 if A is smaller than B or 1 if its bigger
        if( a.length == b.length) return 0;
        return (a.length < b.length)? -1:1;
    }
}

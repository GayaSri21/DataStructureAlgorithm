package gaya;

public class createmeth
{
    public static void main(String[] args)
    {

        char[] letters = {'A', 'G', 'M', 'L',};
        char searchletters;
        int count = countOccurances(letters, searchletters='G');
        System.out.println(count);

    }

    // we're searching to see that how many times it appears in given array
    // we're passing the variable like letters and searchletter to the above
    public static int countOccurances(
            char[] letters, char searchletter) {

        int count = 1;
        for (char letter : letters) {
            if (letter == searchletter) {
                count++;
            }
          //  return count;

        }

        return count;
    }

}




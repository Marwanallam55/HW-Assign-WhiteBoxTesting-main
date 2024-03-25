public class App 
{
    public static void main( String[] args )
    {
        char[] testData = {'M','M','H','K','O','A','P','B','B','L','L'};
        char toFind = 'B';
        System.out.println("The Letter "+toFind+" was found: "+countChar(testData,toFind)+" Times");
    }

    public static int countChar(char[] input, char toFind){
        int count = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] == toFind){
                count++;
            }
        }
        return count;
    }
}
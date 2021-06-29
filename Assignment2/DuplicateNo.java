package Assignment2;

public class DuplicateNo {
	
	public static void main(String[] args) 
    {
        int[] a = { 12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
 
        for (int i = 0; i < a.length-1; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if ((a[i] == a[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+a[j]);
                }
            }
        }
    }

}

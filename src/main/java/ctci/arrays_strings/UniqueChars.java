package ctci.arrays_strings;

public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isUniqueChars("abcdefghijklmnopqrstuvwxyzAB@@"));

	}
	//ASCII VALUE
	private static boolean isUniqueChars(String str)
	{
		int checker = 0; // intially this int will have all bits set to 0.
		int c;
		for(int i = 0; i< str.length(); i++)
		{
			c = str.charAt(i) - 'a';
			System.out.println(c);
			// This step checks whether 'c' indexbit of checker is already set 
			if((checker & (1<<c)) > 0)
			{
				return false;
			}
			// This step is setting index c bit to true
			checker |= (1<<c);
		}
		return true;
	}

}

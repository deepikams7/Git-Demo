/*@Copyright 2023 Key bank ltd. All the rights are reserved
 * you should not disclose the information,otherwise terms and
 * terms and conditions will applu
 */

/**
 * @author Admin
 *
 */
public class PalindromeCheck {

	public boolean isPalindrome(String str) {
		int length =str.length();
		String reverse ="";
		
		for(int i=length-1; i>=0 ;i--) {
			reverse =reverse + str.charAt(i);
		}
		
		if(str.equals(reverse))
			return true;
		else
		
			return false;
	}
}

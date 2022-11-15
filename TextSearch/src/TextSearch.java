public class TextSearch {
	public int findChar(char c, String s) {
		boolean found = false;
		int index = 0;
		while (!found && index < s.length()) {
			if (s.charAt(index) == c)
				found = true;
			else
				index = index + 1;
			// loop invariant:
// (1) found == false : s[0], .., s[index-1]은 모두 c가 아님
// (2) found == true : s.charAt(index) == c
		}
		if (!found)
			index = -1;
		return index;
	}

	public static void main(String[] args) {
		TextSearch text_search = new TextSearch();
		System.out.println(text_search.findChar('a', "Hanyang"));
		System.out.println(text_search.findChar('e', "Hanyang"));
	}
}
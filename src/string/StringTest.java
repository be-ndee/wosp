package string;

class StringTest {
	public static void main(String[] args) {
		StringTest test = new StringTest();
		
		String[] replacedStrings = new String[args.length];
		
		int i = 0;
		for (String str : args) {
			replacedStrings[i] = test.replaceUmlaut(str);
			i++;
		}
		
		test.outputStringArray(args);
		test.outputStringArray(replacedStrings);
	}
	
	// replace all existing umlaute
	public String replaceUmlaut (String str) {
		String newStr = str;
		String[] find = {"\u00e4", "\u00f6", "\u00fc", "\u00c4", "\u00d6", "\u00dc"};
		String[] replace = {"ae", "oe", "ue", "Ae", "Oe", "Ue"};
		for (int i = 0; i < find.length; i++) {
			newStr = newStr.replaceAll(find[i], replace[i]);
		}
		return newStr;
	}
	
	// puts String array out
	public void outputStringArray (String[] strings) {
		for (String str : strings) {
			System.out.println(str);
		}
	}
}
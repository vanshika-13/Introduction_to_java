import javax.swing.JOptionPane;
public class practise {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Enter a string : ");
		String s2 = JOptionPane.showInputDialog("Enter another string : ");
		JOptionPane.showMessageDialog(null, commonPre(s1, s2));
	}
	private static String commonPre(String s1, String s2) {
		int minl = s1.length();
		if (minl > s2.length()) {
			minl = s2.length();
		}
		String commonPrefix = "";
		for (int i = 0; i < minl; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				commonPrefix += s1.charAt(i);
			} else {
				if (commonPrefix.length() > 0) {
					return commonPrefix;
				} else {
					break;
				}
			}
		}
		if (commonPrefix.length() > 0) {
			return commonPrefix;
		}
		return "No common prefix";
	}
}
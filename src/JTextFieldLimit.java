import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Class to limit the number of characters in a JText.
 */
public class JTextFieldLimit extends PlainDocument {
    private final int limit;

    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }
    public void insertString(int offset, String  str, AttributeSet attr) throws BadLocationException {
        if (str == null) return;

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}
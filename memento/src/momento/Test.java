package momento;

public class Test {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor(1, "1st-time-edit");

		TextEditorTracker te = editor.createText();
		System.out.println(te.toString());

		editor = new TextEditor(1, "2nd-time-edit");

		te = editor.createText();
		System.out.println(te.toString());
		editor = new TextEditor(1, "3st-time-edit");

		te = editor.createText();
		System.out.println(te.toString());
		System.out.println("after undo for first time ");
		System.out.println(editor.restore());
		System.out.println("after undo for second time ");
		System.out.println(editor.restore());

	}
}

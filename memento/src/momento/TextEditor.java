package momento;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {

	private long id;
	private String content;
	static List<TextEditorTracker> tracker;

	static {
		tracker = new ArrayList<>();
	}

	public TextEditor(long id, String content) {

		this.id = id;
		this.content = content;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TextEditorTracker createText() {
		TextEditorTracker tx = new TextEditorTracker(id, content);
		tracker.add(tx);

		return tx;
	}

	public TextEditorTracker restore() {
		tracker.remove(tracker.size() - 1);

		return tracker.get(tracker.size() - 1);

	}

	@Override
	public String toString() {
		return "TextEditor [id=" + id + ", content=" + content + "]";
	}

}

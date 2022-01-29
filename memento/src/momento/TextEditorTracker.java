package momento;

public class TextEditorTracker {
	private long id;
	private String content;

	public TextEditorTracker(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "TextEditorTracker [id=" + id + ", content=" + content + "]";
	}

}

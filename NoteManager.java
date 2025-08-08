import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    private List<Note> notes;
    private int nextId;

    public NoteManager() {
        this.notes = new ArrayList<>();
        this.nextId = 1;
    }

    public Note addNote(String title, String content) {
        Note note = new Note(nextId++, title, content);
        notes.add(note);
        return note;
    }

    public List<Note> getAllNotes() {
        return notes;
    }

    public Note findById(int id) {
        for (Note n : notes) if (n.getId() == id) return n;
        return null;
    }

    public boolean updateNote(int id, String newTitle, String newContent) {
        Note n = findById(id);
        if (n == null) return false;
        if (newTitle != null) n.setTitle(newTitle);
        if (newContent != null) n.setContent(newContent);
        return true;
    }

    public boolean deleteNote(int id) {
        return notes.removeIf(n -> n.getId() == id);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NoteManager manager = new NoteManager();
        boolean running = true;

        while (running) {
            System.out.println("\n===== NOTES APP =====");
            System.out.println("1. Add Note");
            System.out.println("2. View All Notes");
            System.out.println("3. Update Note");
            System.out.println("4. Delete Note");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter note title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter note content: ");
                    String content = sc.nextLine();
                    manager.addNote(title, content);
                    System.out.println("Note added successfully!");
                    break;

                case 2:
                    if (manager.getAllNotes().isEmpty()) {
                        System.out.println("No notes found!");
                    } else {
                        System.out.println("=== All Notes ===");
                        for (Note note : manager.getAllNotes()) {
                            System.out.println(note);
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter note ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new title (leave blank to skip): ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter new content (leave blank to skip): ");
                    String newContent = sc.nextLine();

                    boolean updated = manager.updateNote(
                        updateId,
                        newTitle.isEmpty() ? null : newTitle,
                        newContent.isEmpty() ? null : newContent
                    );

                    if (updated) {
                        System.out.println("Note updated successfully!");
                    } else {
                        System.out.println("Note not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter note ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = manager.deleteNote(deleteId);
                    if (deleted) {
                        System.out.println("Note deleted successfully!");
                    } else {
                        System.out.println("Note not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}


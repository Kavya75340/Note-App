# 📓 Java OOP Notes Manager

A simple **text-based notes management application** built in **pure Java** using **Object-Oriented Programming (OOP) principles**.  
It allows you to **create, view, update, and delete notes** directly from the console.  
Notes are stored in memory for now, but can be extended to use file storage.

---

## 🚀 Features

-   **Add Notes** → Enter title and content
-   **View All Notes** → Displays every note with details
-   **Update Notes** → Modify title and/or content
-   **Delete Notes** → Remove notes by their ID
-   **Switch-case Menu** → Simple and intuitive console navigation
-   **OOP Structure** → `Note` class, `NoteManager` for managing notes, `Main` for user interaction
-   **Auto-updated Modified Date** → Every change updates the timestamp

---

## 🛠 Technologies Used

-   **Java 8+**
-   **Core Java Classes**:
    -   `java.util.Scanner` → for user input
    -   `java.util.ArrayList` → to store notes in memory
    -   `java.util.Date` → to store created/modified time

---

## 📂 Project Structure

```
NotesApp/
│
├── Note.java          # Model class for a Note
├── NoteManager.java   # Service layer to manage notes
├── Main.java          # Console UI and menu
└── README.md          # Project documentation
```

---

## 📖 How to Run

1. **Clone this repository**

    ```bash
    git clone https://github.com/Kavya75340/Note-App.git
    cd Note-App
    ```

2. **Compile the Java files**

    ```bash
    javac Main.java NoteManager.java Note.java
    ```

3. **Run the program**
    ```bash
    java Main
    ```

---

## 📌 Example Usage

```
===== NOTES APP =====
1. Add Note
2. View All Notes
3. Update Note
4. Delete Note
5. Exit
Choose an option: 1
Enter note title: Shopping List
Enter note content: Milk, Eggs, Bread
Note added successfully!
```

---

## 💡 Future Improvements

-   Save notes to a file and load them when the program starts
-   Add search by keyword or title
-   Add tags/categories for notes
-   Password-protect notes

---

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).

```

```

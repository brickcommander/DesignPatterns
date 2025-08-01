Certainly! Here’s **full pseudocode** for a text editor using the Command Pattern, supporting undo/redo:

---

### **Command Interface**
```
interface Command:
    execute()
    undo()
```

---

### **Concrete Commands**
```
class TypeTextCommand implements Command:
    constructor(editor, text)
    execute():
        editor.addText(text)
    undo():
        editor.removeText(length of text)

class DeleteTextCommand implements Command:
    constructor(editor, count)
    deletedText = ""
    execute():
        deletedText = editor.getLastNChars(count)
        editor.removeText(count)
    undo():
        editor.addText(deletedText)
```

---

### **Receiver (Editor)**
```
class Editor:
    text = ""

    addText(newText):
        text = text + newText

    removeText(count):
        text = text[0 : length(text) - count]

    getLastNChars(count):
        return text[length(text) - count : length(text)]
```

---

### **Invoker (EditorController)**
```
class EditorController:
    undoStack = []
    redoStack = []

    executeCommand(command):
        command.execute()
        undoStack.push(command)
        redoStack.clear()

    undo():
        if undoStack is not empty:
            command = undoStack.pop()
            command.undo()
            redoStack.push(command)

    redo():
        if redoStack is not empty:
            command = redoStack.pop()
            command.execute()
            undoStack.push(command)
```

---

### **Usage Example**
```
editor = new Editor()
controller = new EditorController()

typeCmd = new TypeTextCommand(editor, "Hello")
controller.executeCommand(typeCmd)   // editor.text: "Hello"

typeCmd2 = new TypeTextCommand(editor, " World")
controller.executeCommand(typeCmd2)  // editor.text: "Hello World"

delCmd = new DeleteTextCommand(editor, 6)
controller.executeCommand(delCmd)    // editor.text: "Hello"

controller.undo()                    // editor.text: "Hello World"
controller.undo()                    // editor.text: "Hello"
controller.redo()                    // editor.text: "Hello World"
```

---

**This structure allows you to add new commands (like formatting, copy/paste, etc.) easily, and supports undo/redo for all actions.**
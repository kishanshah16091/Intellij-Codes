package Class24;

public abstract class File {
//Create a class File that will have the following behaviors:
// open, edit, close.
// Edit and close are implemented method while open is an abstract.
// Create 3 subclasses: JavaFile, WordFile, PdfFile
// that will provide specific implementation of open behaviour:
// Example: to open .java file we need notepad++ or sublime text,
// to open .doc file we need Microsoft word to be installed etc

    abstract void open();

    void edit() {
        System.out.println("edit the file");
    }

    void close() {
        System.out.println("close the file");
    }
}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("open java file using notepad++");
    }

    @Override
    void edit() {
        System.out.println("edit the java file");
    }

    @Override
    void close() {
        System.out.println("close the java file");
    }
}

class WordFile extends File {
    @Override
    void open() {
        System.out.println("to open word file we need to use microsoft word");
    }

    @Override
    void edit() {
        System.out.println("edit the word file");
    }

    @Override
    void close() {
        System.out.println("close the word file");
    }
}

class PdfFile extends File {
    @Override
    void open() {
        System.out.println("to open PDF file we need to use Adobe reader");
    }

    @Override
    void edit() {
        System.out.println("edit the PDF file");
    }

    @Override
    void close() {
        System.out.println("close the PDF file");
    }
}

class testFiles {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new WordFile(), new PdfFile()};
        for (File f : files) {
            f.open();
            f.edit();
            f.close();
        }
    }
}
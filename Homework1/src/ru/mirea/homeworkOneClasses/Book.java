package ru.mirea.homeworkOneClasses;

public class Book {
    private String name;
    private int pages;
    private int bookmark;

    public Book(String n, int p, int b) {
        name = n;
        pages = p;
        bookmark = b;
        if (bookmark > pages) {
            bookmark = pages;
        }
    }
    public Book(String n, int p) {
        name = n;
        pages = p;
        bookmark = 0;
    }
    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
        if (this.bookmark > this.pages) {
            this.bookmark = this.pages;
        }
    }
    public int getBookmark() {
        return bookmark;
    }
    public String toString() {
        return "This is the book named " + this.name + " with " + this.pages + " pages in it with bookmark on page " +
                this.bookmark;
    }
    public void symbolsCount(int fontsize) {
        int symbols;
        symbols = this.pages * 250000 / (fontsize * fontsize);
        System.out.println("This book has " + symbols + " symbols");
    }
}

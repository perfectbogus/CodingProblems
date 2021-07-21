package dev.perfectbogus.linkedinL.BookCatalog;

public interface BookReadOnly {
    int getId();

    String getTitle();

    String getAuthor();

    String toString();

    Price getPrice();
}

package com.qa.ims.persistence.domain;

public class Item
 {

    private Long id;
    private String title;
    private String author;
    private String pages;

    public Item(String title, String author, int pages) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPages(pages);
    }

    public Item(Long id, String title, String author, int pages) {
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);
        this.setPages(pages);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "id:" + id + " Title: " + title + " Author: " + author + " Pages: " + pages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item
 other = (Item
) obj;
        if (getFirstName() == null) {
            if (other.getFirstName() != null)
                return false;
        } else if (!getFirstName().equals(other.getFirstName()))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        return true;
    }

}

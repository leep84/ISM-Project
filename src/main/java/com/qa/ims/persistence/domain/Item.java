package com.qa.ims.persistence.domain;

public class Item
 {

    private Long id;
    private String title;
    private String author;
    private int pages;

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

    public int getPages() {
        return pages;
    }

     public void setPages(int pages) {
         this.pages = pages;
     }

     @Override
    public String toString() {
        return "id:" + id + " Title: " + title + " Author: " + author + " Pages: " + pages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
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
        if (getTitle() == null) {
            if (other.getTitle() != null)
                return false;
        } else if (!getTitle().equals(other.getTitle()))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (getAuthor() == null) {
            if (other.getAuthor() != null)
                return false;
        } else if (!getAuthor().equals(other.getAuthor()))
            return false;
        return true;
    }

}

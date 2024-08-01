/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comments;

import Users.User;


public class Comment {
    private int id;
    private User users;
    private String comments;

    public int getId() {
        return id;
    }

    public User getUsers() {
        return users;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Comment(int id, User users, String comments) {
        this.id = id;
        this.users = users;
        this.comments = comments;
    }

    public Comment() {
        this(0, new User(), "");
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", users=" + users + ", comments=" + comments + '}';
    }
}

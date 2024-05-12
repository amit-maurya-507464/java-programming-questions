package org.example.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Comment {

    private Long id;
    private int postId;
    private int userId;
    private String text;
    private Long commentId;

    private List<Comment> replies;

    public List<Comment> getReplies() {
        return replies;
    }

    public void setReplies(List<Comment> replies) {
        this.replies = replies;
    }

    public Comment(Long id, int postId, int userId, String text, Long commentId) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.text = text;
        this.commentId = commentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", postId=" + postId +
                ", userId=" + userId +
                ", text='" + text + '\'' +
                ", commentId=" + commentId +
                ", replies=" + replies +
                '}';
    }
}

public class CommentsImplementation {

    public static void main(String[] args) {

        Comment comment = new Comment(1L, 401, 99, "Hello Everyone", 0L);
        Comment reply1 = new Comment(2L, 401, 101, "Hi", 1L);
        Comment reply2 = new Comment(3L, 401, 199, "Good Morning", 1L);
        Comment reply3 = new Comment(4L, 401, 192, "Good Evening", 3L);
        Comment reply4 = new Comment(5L, 401, 996, "Bye Bye", 2L);
        Comment reply5 = new Comment(6L, 401, 991, "Hello Everyone", 3L);
        Comment reply6 = new Comment(7L, 401, 919, "Hello Everyone", 6L);
        Comment comment2 = new Comment(11L, 501, 99, "Hello Everyone", 0L);
        Comment r1 = new Comment(12L, 501, 991, "Hi", 11L);
        Comment r2 = new Comment(13L, 501, 992, "Bye", 12L);

        List<Comment> comments = Arrays.asList(comment, reply1, reply2, reply3, reply4, reply5, reply6, comment2, r1, r2);

        Map<Long, List<Comment>> groupedComments = comments.stream().collect(Collectors.groupingBy(Comment::getCommentId));

        List<Comment> nestedComments = buildNestedComments(0L, groupedComments);

        System.out.println(nestedComments);
    }

    // Recursive method to build nested comments
    private static List<Comment> buildNestedComments(Long parentId, Map<Long, List<Comment>> groupedComments) {
        List<Comment> comments = groupedComments.get(parentId);
        if (comments == null) {
            return Collections.emptyList();
        }
        return comments.stream()
                .map(comment -> {
                    comment.setReplies(buildNestedComments(comment.getId(), groupedComments));
                    return comment;
                })
                .collect(Collectors.toList());
    }
}

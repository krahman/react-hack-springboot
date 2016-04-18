package hack.react.services;

import hack.react.models.Comment;

import java.util.List;


public interface CommentService {
    List<Comment> getComments();

    List<Comment> addComment(Comment comment);
}

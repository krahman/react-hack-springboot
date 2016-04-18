package hack.react.services;

import hack.react.models.Comment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommentServiceImpl implements CommentService {

    private List<Comment> comments = new ArrayList<>();

    public CommentServiceImpl() {
        comments.add(new Comment("Peter Parker", "This is a comment."));
        comments.add(new Comment("John Doe", "This is *another* comment."));
    }

    @Override
    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public List<Comment> addComment(Comment comment) {
        comments.add(comment);
        return comments;
    }
}

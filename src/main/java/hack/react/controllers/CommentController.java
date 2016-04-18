package hack.react.controllers;

import hack.react.models.Comment;
import hack.react.services.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private CommentServiceImpl commentServiceImpl;

    @Autowired
    private CommentController(CommentServiceImpl commentServiceImpl) {
        this.commentServiceImpl = commentServiceImpl;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Comment> getComments() {
        return this.commentServiceImpl.getComments();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Comment> addComment(@RequestBody Comment comment) {
        return this.commentServiceImpl.addComment(comment);
    }
}


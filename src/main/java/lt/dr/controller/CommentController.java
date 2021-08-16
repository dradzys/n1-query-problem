package lt.dr.controller;

import lombok.RequiredArgsConstructor;
import lt.dr.model.Comment;
import lt.dr.repository.CommentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comment")
@RequiredArgsConstructor
public class CommentController {

  private final CommentRepository commentRepository;

  @GetMapping("/as-n-queries")
  public Iterable<Comment> getCommentsWithNQueries() {
    return commentRepository.findAll();
  }

  @GetMapping("/as-n-queries/v2")
  public Iterable<Comment> getCommentsWithNQueriesV2() {
    return commentRepository.findAllNQueries();
  }

  @GetMapping("/as-single-query")
  public Iterable<Comment> getCommentsWithSingleQuery() {
    return commentRepository.findAllSingleQuery();
  }
}

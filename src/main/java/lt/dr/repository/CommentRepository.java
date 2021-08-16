package lt.dr.repository;

import java.util.UUID;
import lt.dr.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, UUID> {

  @Query("SELECT comment FROM Comment comment JOIN FETCH comment.post")
  Iterable<Comment> findAllSingleQuery();

  @Query("SELECT c FROM Comment c INNER JOIN Post p ON p.uuid = c.post.uuid")
  Iterable<Comment> findAllNQueries();
}

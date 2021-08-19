package lt.dr.model;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Comment {

  @Id
  @GeneratedValue
  private UUID uuid;

  private String comment;

  @ManyToOne(fetch = FetchType.LAZY)
  private Post post;
}

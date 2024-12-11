package pj.flash_ai.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "flashcards")
@Getter
@Setter
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uId;
    private String title;
    private String question;

    @ElementCollection
    private List<String> answers;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

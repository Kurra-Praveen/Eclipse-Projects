package mappings;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class QuestionOneToOne {

	@Id
	@Column(name="question_id",unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;
	
	private String question;
	
	@OneToOne( cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)	
	private AnswerOneToOne answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public AnswerOneToOne getAnswer() {
		return answer;
	}

	public void setAnswer(AnswerOneToOne answer) {
		this.answer = answer;
	}

	public QuestionOneToOne(String question, AnswerOneToOne answer) {
		//this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public QuestionOneToOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

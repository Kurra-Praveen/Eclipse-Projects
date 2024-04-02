package mappings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnswerOneToOne {

	@Id
	@Column(name="answer_id",unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answerId;
	
	private String answer;
	
//	@OneToOne(fetch = FetchType.LAZY )
//	@JoinColumn(name = "question_id")
//	private QuestionOneToOne question;

//	public QuestionOneToOne getQuestion() {
//	    return question;
//	}
//
//	public void setQuestion(QuestionOneToOne question) {
//	    this.question = question;
//	}


	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public AnswerOneToOne( String answer) {
		//this.answerId = answerId;
		this.answer = answer;
	}

	public AnswerOneToOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

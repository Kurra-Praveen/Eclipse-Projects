package mappings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerOneToMany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answerId;
	
	private String Answer;
	
	@ManyToOne
	private QuestionOneToMany question;
	
	
	
	public QuestionOneToMany getQuestion() {
		return question;
	}

	public void setQuestion(QuestionOneToMany question) {
		this.question = question;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	

	public AnswerOneToMany(String answer, QuestionOneToMany question) {
		Answer = answer;
		this.question = question;
	}

	public AnswerOneToMany() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String toString() {
//		return "AnswerOneToMany [answerId=" + answerId + ", Answer=" + Answer + ", question=" + question + "]";
//	}
	
	
	
	
}

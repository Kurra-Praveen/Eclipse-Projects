package mappings;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuestionOneToMany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;
	
	private String Questinon;
	
	//, orphanRemoval = true, fetch = FetchType.LAZY
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<AnswerOneToMany> answer;

	public String getQuestinon() {
		return Questinon;
	}

	public void setQuestinon(String questinon) {
		Questinon = questinon;
	}


	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public List<AnswerOneToMany> getAnswer() {
		return answer;
	}

	public void setAnswer(List<AnswerOneToMany> answer) {
		this.answer = answer;
	}

	public QuestionOneToMany() {
		super();
	}

	public QuestionOneToMany(String questinon, List<AnswerOneToMany> answer) {
		Questinon = questinon;
		this.answer = answer;
	}

//	@Override
//	public String toString() {
//		return "QuestionOneToMany [questionId=" + questionId + ", Questinon=" + Questinon + ", answer=" + answer + "]";
//	}
	
	
	
}

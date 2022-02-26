package mul.camp.a.dto;


/*
 	CREATE TABLE COMMENTS(
	SEQ NUMBER(8) PRIMARY KEY,
    ID VARCHAR2(50) NOT NULL,  
    CONTENT VARCHAR2(4000) NOT NULL,
    WDATE DATE NOT NULL    
	);

	CREATE SEQUENCE SEQ_COMMENTS
	START WITH 1 INCREMENT BY 1;

	ALTER TABLE COMMENTS
	ADD CONSTRAINT FK_COMMENTS_SEQ FOREIGN KEY(SEQ)
	REFERENCES BBS(SEQ);
  
 */
public class CommentDto {
	
	private int seq;
	private String id;
	private String content;
	private String wdate;
	
	public CommentDto() {
		
	}

	public CommentDto(int seq, String id, String content, String wdate) {
		super();
		this.seq = seq;
		this.id = id;
		this.content = content;
		this.wdate = wdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	@Override
	public String toString() {
		return "CommentDto [seq=" + seq + ", id=" + id + ", content=" + content + ", wdate=" + wdate + "]";
	}
	
	

}

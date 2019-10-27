package com.yongsik.sb;

public class BoardVo {
	private String title;
	private String content;
	
	 //기본생성자 -> BoardVo 앞에 void등이 들어가는순간 메소드가 됨(생성자가 아니게된다)
	 public BoardVo() {}
	
	 //생성자를 통한 방법(기본생성자에서 값을 넣은 형태)
	 public BoardVo(String a, String b) {
		 this.title = a;
		 this.content = b;
	 }
	 
	//값을 메소드를 통해(넣고, 뺀다) => 빼는것은 이 방법으로만 가능.
		//getter(넣는것), setter(빼는것) 
		
		//값을 생성자를 통해(넣는다)
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
}

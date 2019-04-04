class Conversation extends Product {
	private String conversationTopic, author,publisher;
	public Conversation (String id, String info, String maker, int price, String conversationTopic, String publisher){
		super(id,info,maker,price);
		this.conversationTopic=conversationTopic;
		this.publisher=publisher;
	}
	public void setConversationTopic(String conversationTopic){
		this.conversationTopic=conversationTopic;
	}
	public String getConversationTopic(){
		return conversationTopic;
	}
	public void setPublisher(String publisher){
		this.publisher=publisher;
	}
	public String getPublisher(){
		return publisher;
	}
	public void show(){
		System.out.println("================================================");
		System.out.println("[ID] : "+getId());
		System.out.println("[Information] : "+getInfo());
		System.out.println("[Maker] : "+getMaker());
		System.out.println("[Price] : "+getPrice());
		System.out.println("[Conversation Topic] : "+getConversationTopic());
		System.out.println("[Publisher] : "+getPublisher());
		System.out.println("================================================");
	}

}
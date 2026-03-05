package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	private String topic;

	public CreateTopicMsg(String user, String topic) {
		super(MessageType.CREATETOPIC, user);
		this.topic = topic;
	}

	// Superclass only has getters, running on the assumption that one cannot update the topic of an already published message
	public String getTopic() {
		return topic;
	}

	@Override
	public String toString() {
		return "Message [type=" + super.getType() + ", user=" + super.getUser() + ", topic=" + topic +"]";
	}
}

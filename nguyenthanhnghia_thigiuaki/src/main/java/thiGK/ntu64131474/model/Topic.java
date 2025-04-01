package thiGK.ntu64131474.model;

public class Topic {
    public String id;
    
    public String topicName;
    public String topicDescription;
    public Long supervisorId;
    public String topicType;

 
 
    public Topic(String id,String topicName, String topicDescription, Long supervisorId, String topicType) {
        this.id = id;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.supervisorId = supervisorId;
        this.topicType = topicType;
    }

}

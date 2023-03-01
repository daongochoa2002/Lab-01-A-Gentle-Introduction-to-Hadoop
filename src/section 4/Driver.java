import java.nio.file.Paths;   
import java.nio.file.Files;
import java.nio.file.Path; 
public class Driver{
    public static void main(String[] args) throws Exception{
        UnhealthyRelationship unhealthyRelationship = new UnhealthyRelationship();
        Label label = new Label();
        String unhealthyRelationshipDataInput = args[0];
        String unhealthyRelationshipDataOutput = args[1];
        String labelDataOutput = args[2];
        // job1 find the relationship
        String[] job1Args = {unhealthyRelationshipDataInput,unhealthyRelationshipDataOutput};
        unhealthyRelationship.main(job1Args);
        //job2 label the result
        String[] job2Args = {unhealthyRelationshipDataOutput,labelDataOutput};
        label.main(job2Args);
        
        //execution
        // ~/hadoop/bin/hadoop com.sun.tools.javac.Main Label.java UnhealthyRelationship.java Driver.java 

    }
}
import java.util.logging.Level
import java.util.logging.Logger
import hudson.logging.LogRecorderManager
import hudson.logging.LogRecorder
import java.util.logging.LogRecord

def call(String searchString) { 
 def AgentName= searchString
 def records
        
 //Grabs the log manager
 LogRecorderManager mgr = Jenkins.instance.getLog();
        
 //Grabs the records
 mgr.logRecorders.each{
  if (it.getValue().getName() == "KubernetesLog")
  {
   records = it.getValue().getLogRecords()
  }
  else{
  echo "Log not found"
  }
 }
 //Iterates over the record messages looking for the agent name
 for (LogRecord r : records) {
  if (r.getMessage().contains(AgentName)){
    echo r.getMessage().toString()
  }
 } 
}

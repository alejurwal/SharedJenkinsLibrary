package com.ibm.shared;
//Class for the object for JobInfo.groovy
class JobNameInfo{
  String remotePath;
  String jobUrl;
  JobNameInfo(String remotePath, String jobURL){
    remotePath = remotePath;
    jobURL = jobURL;
  }

  /**Get the remote path for trigger remote and copy artifact remote*/
  String getRemotePath(){
    return remotePath;
  }
  /**Get the jenkins job url */
  String getJobURL(){
    return jobURL;
  }
  /**GEt the short job name without folder full path */
  String getShortName(){
    int index = remotePath.lastIndexOf("/");
    if(index != -1){
      return remotePath.substring(index);
    }else{
      return remotePath;
    }
  }
}

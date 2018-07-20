class Utilities implements Serializable {
  def steps
  Utilities(script) {this.script = script}
  def shell() {
    script.withCredentials([[$class: 'UsernamePasswordMultiBinding',credentialsId: '10dedc95-ba8a-4ffe-bca6-8dea9586c8dc', 
    usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) 
    { 
      //steps.sh "echo $USERNAME:$PASSWORD"
      //steps.sh "echo '$USERNAME:$PASSWORD'"
      script.sh "echo $script.USERNAME:$script.PASSWORD"
      script.sh 'echo $USERNAME:$PASSWORD'
    }
  }
}

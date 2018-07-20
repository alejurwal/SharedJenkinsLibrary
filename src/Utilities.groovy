class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def shell() {
    script.withCredentials([[$class: 'UsernamePasswordMultiBinding',credentialsId: '10dedc95-ba8a-4ffe-bca6-8dea9586c8dc', 
    usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) 
    { 
      //steps.sh "echo $USERNAME:$PASSWORD"
      //steps.sh "echo '$USERNAME:$PASSWORD'"
      script.sh "echo $steps.USERNAME:$steps.PASSWORD"
      script.sh 'echo $USERNAME:$PASSWORD'
    }
  }
}

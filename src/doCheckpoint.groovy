class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def shell() {
    steps.withCredentials([[$class: 'UsernamePasswordMultiBinding',credentialsId: '10dedc95-ba8a-4ffe-bca6-8dea9586c8dc', 
    usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) 
    { 
      steps.sh "echo $USERNAME:$PASSWORD"
      steps.sh "echo '$USERNAME:$PASSWORD'"
      steps.sh "echo '${USERNAME}:${PASSWORD}'"
    }
  }
}

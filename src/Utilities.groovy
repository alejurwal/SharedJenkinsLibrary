class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def shell() {
      steps.sh 'echo "hello"'
      steps.sh returnStdout: true, script: 'echo "hello"'
      steps.sh returnStatus: true, script: 'echo "hello"'
  }
}

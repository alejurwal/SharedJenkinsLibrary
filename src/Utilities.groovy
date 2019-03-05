class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def testingVeryNestedShell(){
    testingNestedShell(command: 'echo "hello"')
  }
  def testingNestedShell(Map arguments){
    shell(arguments)
  }
  def shell(Map arguments) {
    def command = arguments.get('command', null)
      steps.sh command
      steps.sh returnStdout: true, script: command
      steps.sh returnStatus: true, script: command
  }
}

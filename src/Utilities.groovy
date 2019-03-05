class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  // This funciton is called from our Jenkinsfile:

  def conan_init() {
    steps.withCredentials([
      steps.usernamePassword(
        credentialsId: '77c78b5b-f58e-4ef0-96a6-4317eb831aa4',
        usernameVariable: 'PLEX_ARTIFACTORY_USER',
        passwordVariable: 'PLEX_ARTIFACTORY_TOKEN')]) {
      run(command: "echo 'Hello'")
    }
  }

// Which in turns call run:

  def run(Map arguments) {

    def environment = [
      "TEST='ENV_HELP'"
    ]

    steps.withEnv(environment) {
      def cmd = _get_cmdline(arguments)
        steps.sh(cmd)
        steps.sh(script: cmd, returnStdout: true, returnStatus: false)
      }
  }

// Which you see calls _get_cmdline()

  def _get_cmdline(Map arguments) {
    def command = arguments.get('command', null)
    return command
  }


}

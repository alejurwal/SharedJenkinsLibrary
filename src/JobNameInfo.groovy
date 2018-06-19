class A { 
  Script script 
  
  @NonCPS
  def void test() { script.println('lol') }

  A(Script script) { 
    this.script = script 
    //test() 
  } 
  
}

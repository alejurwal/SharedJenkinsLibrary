class A { 
  Script script 

  def void test() { script.println('lol') }

  A(Script script) { 
    this.script = script 
    test() 
  } 
  
}

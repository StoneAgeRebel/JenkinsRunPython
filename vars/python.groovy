def call(String python_script){
    echo "running Python on " + python_script
    def pyFile = file(python_script)
    println("I got a file and it's existance is $pyFile")
    println("pyFile.path = $pyFile.path")
}
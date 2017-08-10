def call(String python_script){
    echo "running Python on " + python_script
    def pyFile = File(python_script)
    println("I got a file and it's existance is $pyFile")
}
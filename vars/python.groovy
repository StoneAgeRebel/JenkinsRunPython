def call(String python_script){
    echo "running Python on " + python_script
    def pyFile = new File(python_script)
    println("I got a file and it's existance is $pyFile")
    def s = pyFile.size()
    println("I got a file and it's size is $s")
}
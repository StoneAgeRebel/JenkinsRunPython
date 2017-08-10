@NonCPS
def call(String python_script){
    echo "running Python on " + python_script
    if(fileExists(python_script)){
        echo "it exists"
        def pyFile = new File(python_script)
        echo "pyFile.exists = ${pyFile.exists()}"
    } else {
        echo "no exist"
    }
//    println("I got a file and it's existance is $pyFile")
//    def s = pyFile.size()
//    println("I got a file and it's size is $s")
}
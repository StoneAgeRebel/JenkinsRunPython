def call(python_script){
    echo "running Python"
    echo python_script
    def files = findFiles(python_script)
    echo files

}
package testgradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction

class HelloWorldTask extends DefaultTask {

    @Optional
    String message = 'test1'

    @TaskAction
    def hello() {
        println "hello world ${message}"
    }
}
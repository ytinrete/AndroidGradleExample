package testgradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project;


public class PluginGradleTest implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        println( 'ya hooooo~~~~ it is the apply:' + project.name)

        println('adding a task into it, and it can be seen outside.')

        project.getTasks().create("a1FromPlugin", {

            println("in the plugin insert task~")

            doLast{
                println("in the plugin insert task~  last")
            }

        })

        project.getTasks().each { task ->
            println( "kkk:" + task.name)
        }

        project.afterEvaluate {
            println( "the project has get over the evaluate!")
        }

    }
}
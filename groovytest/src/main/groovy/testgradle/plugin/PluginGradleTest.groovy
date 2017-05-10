package testgradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project;


public class PluginGradleTest implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        println( 'ya hooooo~~~~ it is the apply:' + project.name)

        project.getTasks().each { task ->
            println( "kkk:" + task.name)
        }

        project.afterEvaluate {
            println( "the project has get over the evaluate!")
        }

    }
}
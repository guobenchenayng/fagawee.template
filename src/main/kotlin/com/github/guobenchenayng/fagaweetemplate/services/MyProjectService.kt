package com.github.guobenchenayng.fagaweetemplate.services

import com.intellij.openapi.project.Project
import com.github.guobenchenayng.fagaweetemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.smartbackme.kangraootemplate.services

import com.github.smartbackme.kangraootemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

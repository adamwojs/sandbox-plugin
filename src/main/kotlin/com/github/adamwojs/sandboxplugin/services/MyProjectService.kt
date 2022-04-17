package com.github.adamwojs.sandboxplugin.services

import com.intellij.openapi.project.Project
import com.github.adamwojs.sandboxplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

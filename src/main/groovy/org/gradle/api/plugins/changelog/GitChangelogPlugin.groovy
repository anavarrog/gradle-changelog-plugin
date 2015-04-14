package org.gradle.api.plugins.changelog

import org.gradle.api.Project
import org.gradle.api.Plugin

class GitChangelogPlugin implements Plugin<Project> {
	static final String EXTENSION_NAME = 'changelog'

    void apply(Project project) {
        project.extensions.create(EXTENSION_NAME, ChangelogPluginExtension)
        project.task('changelog', type: GitChangelogTask)
    }
}

class ChangelogPluginExtension {
    String appName
    String file
    String trackerUrl
    String versionNum
    String match
    String repoUrl
    String versionText
    String from
    String to
    String append
}
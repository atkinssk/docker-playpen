// Inspired by https://wiki.jenkins-ci.org/display/JENKINS/Add+a+Maven+Installation%2C+Tool+Installation%2C+Modify+System+Config
import jenkins.model.*

println "Adding an auto installer for Gradle"

def gradlePluginExtension = Jenkins.instance.getExtensionList(hudson.plugins.gradle.GradleInstallation.DescriptorImpl.class)[0]

def asList = (gradlePluginExtension.installations as List)
asList.add(new hudson.plugins.gradle.GradleInstallation('gradle-1.7', '', [new hudson.tools.InstallSourceProperty([new hudson.plugins.gradle.GradleInstaller("1.7")])]))
asList.add(new hudson.plugins.gradle.GradleInstallation('gradle-2.11', '', [new hudson.tools.InstallSourceProperty([new hudson.plugins.gradle.GradleInstaller("2.11")])]))

gradlePluginExtension.installations = asList
gradlePluginExtension.save()

println "OK - Gradle auto-installer added"

import hudson.model.JDK
import hudson.tools.JDKInstaller
import hudson.tools.InstallSourceProperty
import jenkins.model.Jenkins

def descriptor = new JDK.DescriptorImpl();

if (descriptor.getInstallations()) {
    println 'skip jdk installations'
} else {
    println 'add jdk'
    Jenkins.instance.updateCenter.getById('default').updateDirectlyNow(true)

    def jdk7Installer = new JDKInstaller('jdk-7u80-oth-JPR', true)
    def jdk7 = new JDK("jdk7", null, [new InstallSourceProperty([jdk7Installer])])

    def jdk8Installer = new JDKInstaller('jdk-8u74-oth-JPR', true)
    def jdk8 = new JDK("jdk8", null, [new InstallSourceProperty([jdk8Installer])])

    descriptor.setInstallations(jdk7, jdk8)
}

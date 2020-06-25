def gitUrl = 'git://github.com/Zensar-sys/Opsautomator'

job('test-job') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/2 * * * *')
    }
    
}

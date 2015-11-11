######<center>Gradle任务的几种写法</center>######
```
task (hello) << {
    println "hello"
}
task(copy, type: Copy) {
    from(file('strDir'))
    into(buildDir)
}
```

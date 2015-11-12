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
######<center>Gradle命令</center>######

| 命令 | 解释 |
|--------|--------|
|    gradle tasks    |   查看当前所有可用的task     |
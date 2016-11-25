# ModularizationApplication
组件化的App
这是一个组件化的app，很简单的例子主要是用学习。
下面是组件化的一些步骤：
1.在gradle.propreties 中添加 IsDebug = false
2.在组件modula中的build.gradle中添加（去掉defaultConfig中的applicationId）：
if(IsDebug.toBoolean()){
    apply plugin: 'com.android.application'
}else{
    apply plugin: 'com.android.library'
}
3.在壳APP的build.gradle中dependencies添加：
if(!IsDebug.toBoolean()){
        compile project(':modula')
}

其实这些都是我项目中这个写的，每个项目不同跟据要求来写gradle就可以了

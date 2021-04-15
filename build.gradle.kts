// Top-level build file where you can add configuration options common to all sub-projects/modules.
/*all steps use it in this file are :
   convert all single quotes with double
   change the kotlin_version to a variable
   use kotlin syntax as parantheses
   finally convert task using register to a register function
   and delete task clean function
 */
 */
 */
 */
 */
buildscript {
    val kotlin_version = "1.3.72"
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.1.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
  // Before change
//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
  // After change
tasks.register("clean",Delete::class){
    delete (rootProject.buildDir)
}
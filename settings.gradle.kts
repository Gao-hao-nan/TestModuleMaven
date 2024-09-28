pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven {
            url = uri("http://103.149.90.60:9090/repository/haonan/")
            isAllowInsecureProtocol = true
            credentials {
                username = ""
                password = ""
            }
        }
    }
}

rootProject.name = "TestModuleMaven"
include(":app")
include(":mylibrary")

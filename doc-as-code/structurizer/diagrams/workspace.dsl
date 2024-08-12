workspace {

    // general syntax: 
    // variable name = <type> <name> <description> <tag>
    // after tag can always be opening and closing braces {} and stuff inside


    model {
        # software systems

        exampleSoftwareSystem = softwareSystem "My observed system" "description for my observed system" "observed-system" {
            // curly braces/body can be ommited if you do not need to define containers
            webapp = container "Web Application"
            database = container "Database"

        }

        exampleExternalSoftwareSystem = softwareSystem "An external system" "description for an external system" "external-system"


        # persons 
        exampleUser = person "User" "A User description"

        # relationships
        exampleExternalSoftwareSystem -> exampleSoftwareSystem "Uses"
        exampleUser -> exampleSoftwareSystem "Uses"
        webapp -> database "Reads from and writes to"

    }


    views {
        // system context view for 
        systemContext exampleSoftwareSystem "System-context-diagram" {
            include *
            autoLayout
        }

        container exampleSoftwareSystem "Container-diagram" {
            include *
            autoLayout
        }

        // color blue and use symbol for person
        styles {
            element "observed-system" {
                background #1168bd
                color #ffffff
            }
        
            element "external-system" {
                background #999999
                color #ffffff
            }
            
            element "Person" {
                shape person
                background #08427b
                color #ffffff
            }
            element "Container" {
                background #1168bd
                color #ffffff
            }
        }
        
    }

    configuration {
        scope softwaresystem
    }

}
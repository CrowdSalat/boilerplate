workspace {

    // general syntax: 
    // variable name = <type> <name> <description> <tag>
    // after tag can always be opening and closing braces {} and stuff inside


    model {
        # software systems
            
        // curly braces/body can be ommited if you do not need to define containers
        exampleSoftwareSystem = softwareSystem "My observed system" "description for my observed system" "observed-system" {
            database = container "Database" 
            webapp = container "Web Application" {
                c1 = component "Component 1"    
                c2 = component "Component 2" 
            }

        }

        exampleExternalSoftwareSystem = softwareSystem "An external system" "description for an external system" "external-system"


        # persons 
        exampleUser = person "User" "A User description"

        # relationships
        exampleExternalSoftwareSystem -> exampleSoftwareSystem "Uses"
        // if ommited the next relation from a child is used
        exampleUser -> exampleSoftwareSystem "Uses"
        webapp -> database "Reads from and writes to"
        exampleUser -> c1 "Does specific stuff as wellUses"
        c1 -> c2 "Does specific stuff"
        c2 -> database "Reads from and writes to"
    }


    views {
        # system context view for 
        systemContext exampleSoftwareSystem "System-context-diagram" {
            include *
        }
        # container view
        container exampleSoftwareSystem "Container-diagram" {
            include *
            autoLayout
        }

        # component view
        component webapp {
            include *
            autoLayout lr
        }

        // color blue and use symbol for person
        styles {
            // uses tag as reference instead of type
            element "observed-system" {
                background #1168bd
                color #ffffff
            }
            // uses tag as reference instead of type
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
            element "Component" {
                background #85BBF0
                color #ffffff
            }
            
        }
        
    }

    configuration {
        scope softwaresystem
    }

}